package com.porfanid.backend.book;

import com.porfanid.backend.book.Book;
import com.porfanid.backend.book.BookController;
import com.porfanid.backend.book.BookService;
import com.porfanid.backend.service.requests.Requests;
import com.porfanid.backend.service.requests.RequestsRepo;
import com.porfanid.backend.user.User;
import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BookControllerTest {

    @Mock
    private BookService bookService;

    @Mock
    private RequestsRepo requestsRepo;

    @Mock
    private HttpSession session;

    @Mock
    private Model model;

    @InjectMocks
    private BookController bookController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAddBookToDatabase() {
        User user = new User();
        user.setUsername("testUser");

        when(session.getAttribute("user")).thenReturn(user);

        String result = bookController.addBookToDatabase("Title", "Author", "Category", "Summary", session, model);

        assertEquals("redirect:/book", result);
        verify(bookService).saveBook(any(Book.class));
    }

    @Test
    void testAddBookRedirectIfUserNull() {
        when(session.getAttribute("user")).thenReturn(null);

        String result = bookController.addBookToDatabase("Title", "Author", "Category", "Summary", session, model);

        assertEquals("redirect:/login", result);
        verifyNoInteractions(bookService);
    }

    @Test
    void testGetBooks() {
        User user = new User();
        user.setUsername("testUser");

        List<Book> bookList = new ArrayList<>();
        Book book = new Book("Title", "testUser", "Author", "Category", "Summary");
        bookList.add(book);

        List<Requests> requestsList = new ArrayList<>();
        Requests request = new Requests();
        request.setTitle("Title");
        request.setHolder("testUser");
        requestsList.add(request);

        when(session.getAttribute("user")).thenReturn(user);
        when(bookService.getAllBooks()).thenReturn(bookList);
        when(requestsRepo.findAll()).thenReturn(requestsList);

        String result = bookController.getBooks(session, model);

        assertEquals("books", result);
        verify(model).addAttribute(eq("userBooks"), anyList());
        verify(model).addAttribute(eq("otherBooks"), anyList());
        verify(model).addAttribute(eq("currentUser"), eq(user));
    }

    @Test
    void testSaveBook() throws URISyntaxException {
        Book book = new Book("Title", "testUser", "Author", "Category", "Summary");

        ResponseEntity<?> response = bookController.saveBook(book);

        assertEquals("/book/Title", response.getHeaders().getLocation().toString());
        verify(bookService).saveBook(eq(book));
    }

    @Test
    void testDeleteBook() {
        Book book = new Book("Title", "testUser", "Author", "Category", "Summary");

        ResponseEntity<?> response = bookController.deleteBook(book);

        assertEquals(204, response.getStatusCodeValue());
        verify(bookService).deleteBook(eq(book));
    }
}