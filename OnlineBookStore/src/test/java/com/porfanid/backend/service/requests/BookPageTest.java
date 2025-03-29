package com.porfanid.backend.service.requests;

import com.porfanid.backend.user.User;
import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BookPageTest {

    @Mock
    private HttpSession session;

    @Mock
    private Model model;

    @Mock
    private RequestsRepo requestsRepo;

    @InjectMocks
    private BookPage bookPage;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testBorrowBook() {
        User user = new User();
        user.setUsername("testUser");
        when(session.getAttribute("user")).thenReturn(user);

        String title = "Test Book";
        String owner = "Owner";
        String redirect = bookPage.borrowBook(title, owner, session, model);

        assertEquals("successRequest", redirect);
        verify(requestsRepo).save(any(Requests.class));
    }

    @Test
    void testBorrowBookRedirectIfUserNull() {
        when(session.getAttribute("user")).thenReturn(null);

        String title = "Test Book";
        String owner = "Owner";
        String redirect = bookPage.borrowBook(title, owner, session, model);

        assertEquals("redirect:/login", redirect);
        verifyNoInteractions(requestsRepo);
    }

    @Test
    void testAcceptRequest() {
        String username = "testUser";
        String title = "Test Book";
        String holder = "Holder";
        String successView = bookPage.acceptRequest(username, title, holder, model);

        assertEquals("successAcceptRequest", successView);
        verify(requestsRepo).updateAcceptedStatus(any(Requests.class));
    }

    @Test
    void testRejectRequest() {
        String username = "testUser";
        String title = "Test Book";
        String holder = "Holder";
        String successView = bookPage.rejectRequest(username, title, holder, model);

        assertEquals("successRejectRequest", successView);
        verify(requestsRepo).updateDeniedStatus(any(Requests.class));
    }
}
