package com.porfanid.backend.book;

import com.porfanid.backend.service.requests.Requests;
import com.porfanid.backend.service.requests.RequestsRepo;
import com.porfanid.backend.user.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    public static class BookCase{
        public Book book;
        public String lendedTo;
        public ArrayList<Requests> requestsToThisBook;

        public BookCase(){
            requestsToThisBook = new ArrayList<>();
        }

        public boolean hasRequestedTheBook(User user){
            for(Requests r:requestsToThisBook){
                if(r.getUsername().equals(user.getUsername())){
                    return true;
                }
            }
            return false;
        }
    }

    private final BookService bookService;
    private final RequestsRepo requestsRepo;

    public BookController(BookService bookService, RequestsRepo requestsRepo) {
        this.bookService = bookService;
        this.requestsRepo = requestsRepo;
    }

    @PostMapping("/add")
    public String addBookToDatabase(@RequestParam String title, @RequestParam String author, @RequestParam String category, @RequestParam String summary, HttpSession session, Model model) {
        User temp = (User)session.getAttribute("user");
        if (temp==null){
            return "redirect:/login";
        }
        Book book = new Book(title, temp.getUsername(), author, category, summary);
        bookService.saveBook(book);
        return "redirect:/book";
    }

    @GetMapping("/add")
    public String addBook(HttpSession session, Model model) {
        User temp = (User)session.getAttribute("user");
        if (temp==null){
            return "redirect:/login";
        }
        model.addAttribute("user", temp.getUsername());
        return "add-book";
    }

    @GetMapping
    public String getBooks(HttpSession session, Model model) {

        User temp = (User)session.getAttribute("user");
        if (temp==null){
            return "redirect:/login";
        }
        List<Book> bookList = bookService.getAllBooks();
        List<Requests> requestsList = requestsRepo.findAll();




        ArrayList<BookCase> otherBooks = new ArrayList<>();
        ArrayList<BookCase> books = new ArrayList<>();

        for (Book book : bookList) {
            BookCase b = new BookCase();
            b.book = book;

            for(Requests r:requestsList){
                if(r.getTitle().equals(book.getTitle())&&r.getHolder().equals(book.getUsername())){
                    b.requestsToThisBook.add(r);
                    if(r.isAccepted()>0){
                        b.lendedTo = r.getUsername();
                    }
                }
            }
            if(book.getUsername().equals(temp.getUsername())){
                books.add(b);
            }else{
                otherBooks.add(b);
            }
        }

        model.addAttribute("userBooks", books);
        model.addAttribute("otherBooks", otherBooks);
        model.addAttribute("currentUser", temp);

        return "books";
    }

    @PostMapping
    public ResponseEntity<?> saveBook(@RequestBody Book book) throws URISyntaxException {
        bookService.saveBook(book);
        return ResponseEntity.created(new URI("/book/" + book.getTitle())).build();
    }

    @DeleteMapping
    public ResponseEntity<?> deleteBook(@RequestBody Book book) {
        bookService.deleteBook(book);
        return ResponseEntity.noContent().build();
    }

    // Other REST endpoints for book management can be added here
}