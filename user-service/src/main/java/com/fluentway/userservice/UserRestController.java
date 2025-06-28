package com.fluentway.userservice;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserRestController {

    private final UserRepository repository;

    public UserRestController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return repository.findAll();
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User user) {
        return repository.save(user);
    }
}
