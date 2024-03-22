package com.porfanid.backend.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class FrontPage {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String loginForm() {
        return "login"; // This corresponds to the name of your HTML file without the extension
    }

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String pass, Model model) {
        // Your authentication logic here
        if (authenticateUser(email, pass)) {
            // Successful authentication
            return "redirect:/dashboard"; // Redirect to the dashboard page
        } else {
            // Authentication failed, display error message
            model.addAttribute("error", true);
            return "redirect:/login.html?error=1"; // Redirect back to the login page with error parameter
        }
    }

    private boolean authenticateUser(String email, String pass) {
        List<User> users= userService.getAllUsers();
        for(User user:users){
            if(user.getUsername().equals(email) && user.verifyPassword(pass)){
                return true;
            }
        }
        return false; // Placeholder, replace with actual logic
    }
}
