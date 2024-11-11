package com.example.demo.User;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<User> getUsers() {
        List<User> users = Arrays.asList(
                new User(1, "My name is Chan Suvnanet"));
        return users;
    }

}
