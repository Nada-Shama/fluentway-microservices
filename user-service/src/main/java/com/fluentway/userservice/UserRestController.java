package com.fluentway.userservice;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class UserRestController {

    private final List<Map<String, String>> users = new ArrayList<>(List.of(
        Map.of("id", "1", "name", "Nada"),
        Map.of("id", "2", "name", "Ali"),
        Map.of("id", "3", "name", "Sara")
    ));

    @GetMapping("/users")
    public List<Map<String, String>> getUsers() {
        return users;
    }

    @PostMapping("/users")
    public Map<String, String> addUser(@RequestBody Map<String, String> user) {
        users.add(user);
        return user;
    }
}
