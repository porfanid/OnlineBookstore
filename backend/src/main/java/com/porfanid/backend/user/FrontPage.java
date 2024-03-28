package com.porfanid.backend.user;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Objects;

@Controller
public class FrontPage {

    @Autowired
    private UserService userService;

    @GetMapping("/profile")
    public ResponseEntity<?> getUserProfile(HttpSession session) {
        User user = (User)session.getAttribute("user");
        System.out.println(user);
        return ResponseEntity.ok(Objects.requireNonNullElse(user, "redirect:/homepage.html"));
    }


    @PostMapping("/profile")
    public ResponseEntity<?> saveUserProfile(HttpSession session) {
        User user = (User)session.getAttribute("user");
        System.out.println(user);
        return ResponseEntity.ok(Objects.requireNonNullElse(user, "redirect:/homepage.html"));
    }

    @GetMapping("/register")
    public String register()
    {
        return "register";
    }

    @GetMapping("/login")
    public String login()
    {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String pass, HttpSession session) {
        // Your authentication logic here
        User trying_user = authenticateUser(email, pass);
        if (trying_user!=null) {
            // Successful authentication
            session.setAttribute("user", trying_user);
            return "redirect:/profile.html"; // Redirect to the dashboard page
        }else {
            // Authentication failed, display error message
            return "redirect:/login?error=1"; // Redirect back to the login page with error parameter
        }
    }

    private User authenticateUser(String email, String pass) {
        List<User> users= userService.getAllUsers();
        for(User user:users){
            if(user.getUsername().equals(email) && user.verifyPassword(pass)){
                return user;
            }
        }
        return null; // Placeholder, replace with actual logic
    }
}
