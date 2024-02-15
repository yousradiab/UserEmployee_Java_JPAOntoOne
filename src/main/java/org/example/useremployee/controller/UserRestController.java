package org.example.useremployee.controller;

import org.example.useremployee.model.User;
import org.example.useremployee.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRestController {

    @Autowired
    UserRepository userRepository;
    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    };
}
