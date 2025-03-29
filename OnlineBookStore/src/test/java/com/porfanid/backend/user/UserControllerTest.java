package com.porfanid.backend.user;

import com.porfanid.backend.user.User;
import com.porfanid.backend.user.UserController;
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

class UserControllerTest {

    @Mock
    private HttpSession session;

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllUsers() {
        List<User> userList = new ArrayList<>();
        userList.add(new User());
        userList.add(new User());

        when(userService.getAllUsers()).thenReturn(userList);

        List<User> result = userController.getAllUsers();

        assertEquals(userList, result);
    }

    @Test
    void testLogout() {
        String redirect = userController.logout(session);

        assertEquals("redirect:/book", redirect);
        verify(session).removeAttribute("user");
    }

    @Test
    void testSaveUser() {
        String email = "test@example.com";
        String password = "password";
        String confirmPassword = "password";
        String fullName = "Test User";
        String address = "123 Test St";
        int age = 30;
        String phoneNumber = "1234567890";

        String redirect = userController.saveUser(email, password, confirmPassword, fullName, address, age, phoneNumber, session);

        assertEquals("redirect:/book", redirect);
        verify(session).setAttribute(eq("user"), any(User.class));
        verify(userService).saveUser(any(User.class));
    }

    @Test
    void testDeleteUser() {
        User user = new User();

        userController.deleteUser(user);

        verify(userService).deleteUser(eq(user));
    }
}
