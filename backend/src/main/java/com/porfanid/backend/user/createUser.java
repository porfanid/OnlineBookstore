package com.porfanid.backend.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/create-user")
public class createUser {

    @Autowired
    private UserService userService;

    @GetMapping
    public void getAllUsers() {
        User temp = new User("pavlos@orfanidis.net.gr","12345");
        userService.saveUser(temp);
    }

    // Other REST endpoints for user management can be added here
}
