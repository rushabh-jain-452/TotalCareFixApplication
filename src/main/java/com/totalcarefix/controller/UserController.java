package com.totalcarefix.controller;

import com.totalcarefix.model.User;
import com.totalcarefix.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/get")
    private String getUser() {
        return "Username is Rushabh";
    }

    @GetMapping("/test")
    private User getUsers() {
        User user = new User();
        user.setUserid(1);
        user.setFirstName("Rushabh");
        user.setLastName("Jain");

        return user;
    }

    @PostMapping("/test")
    private void addUser() {
        // Code to add user
        userService.addUser();
    }

    @PutMapping("/test")
    private void updateUser() {
        // Code to add user
    }

    @DeleteMapping("/test")
    private void deleteUser() {
        // Code to add user
    }

}
