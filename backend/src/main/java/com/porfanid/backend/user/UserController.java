package com.porfanid.backend.user;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("user");
        return "redirect:/book";
    }
    

    @PostMapping
    public String saveUser(@RequestParam String email,@RequestParam String password, @RequestParam String confirmPassword, @RequestParam String fullName, @RequestParam String address,@RequestParam int age, @RequestParam String phoneNumber, HttpSession session){
        User tempUser = new User(email, password, fullName, address, age, phoneNumber);
        session.setAttribute("user", tempUser);
        System.out.println("Saving user"+tempUser);
        userService.saveUser(tempUser);
        return "redirect:/book";
    }

    @DeleteMapping
    public void deleteUser(@RequestBody User user) {
        userService.deleteUser(user);
    }
    // Other REST endpoints for user management can be added here
}

