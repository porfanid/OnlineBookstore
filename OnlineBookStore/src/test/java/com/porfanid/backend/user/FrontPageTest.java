package com.porfanid.backend.user;
import com.porfanid.backend.user.FrontPage;
import com.porfanid.backend.user.User;
import com.porfanid.backend.user.UserService;
import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class FrontPageTest {

    @Mock
    private HttpSession session;

    @Mock
    private UserService userService;

    @InjectMocks
    private FrontPage frontPage;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetHomePage() {
        String redirect = frontPage.getHomePage(session);
        assertEquals("redirect:/book", redirect);
    }

    @Test
    void testGetUserProfile() {
        User user = new User();
        user.setUsername("testUser");

        when(session.getAttribute("user")).thenReturn(user);

        ResponseEntity<?> responseEntity = frontPage.getUserProfile(session);

        assertEquals(user, responseEntity.getBody());
    }

    @Test
    void testUpdateUserProfile() {
        User user = new User();
        user.setUsername("testUser");

        when(session.getAttribute("user")).thenReturn(user);

        ResponseEntity<?> responseEntity = frontPage.updateUserProfile(user, session);

        assertEquals(user, responseEntity.getBody());
        verify(userService).UpdateUser(eq(user), anyString());
    }

    @Test
    void testUserProfilePage() {
        User user = new User();
        user.setUsername("testUser");

        when(session.getAttribute("user")).thenReturn(user);

        String page = frontPage.userProfilePage(session);

        assertEquals("profile", page);
    }

    @Test
    void testSaveUserProfile() {
        User user = new User();
        user.setUsername("testUser");

        when(session.getAttribute("user")).thenReturn(user);

        ResponseEntity<?> responseEntity = frontPage.saveUserProfile(session);

        assertEquals(user, responseEntity.getBody());
    }

    @Test
    void testLogin() {
        User user = new User();
        user.setUsername("testUser");
        List<User> users = new ArrayList<>();
        users.add(user);

        when(userService.getAllUsers()).thenReturn(users);

        String email = "testUser";
        String pass = "password";

        String redirect = frontPage.login(email, pass, session);

        assertEquals("redirect:/book", redirect);
        verify(session).setAttribute("user", user);
    }

    @Test
    void testLoginWithInvalidCredentials() {
        List<User> users = new ArrayList<>();

        when(userService.getAllUsers()).thenReturn(users);

        String email = "testUser";
        String pass = "password";

        String redirect = frontPage.login(email, pass, session);

        assertEquals("redirect:/login?error=1", redirect);
        verifyNoInteractions(session);
    }
}
