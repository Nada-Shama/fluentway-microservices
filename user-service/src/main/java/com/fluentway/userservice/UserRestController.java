package com.fluentway.userservice;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UserRestController {

    private final List<Map<String, String>> users = new ArrayList<>(List.of(
        Map.of("id", "1", "name", "Nada"),
        Map.of("id", "2", "name", "Ali"),
        Map.of("id", "3", "name", "Sara")
    ));

    @GetMapping
    public List<Map<String, String>> getUsers() {
        return users;
    }

    @PostMapping
    public Map<String, String> addUser(@RequestBody Map<String, String> user) {
        if (user.containsKey("id") && user.containsKey("name")) {
            users.add(user);
            return user;
        } else {
            return Map.of("error", "Invalid user format");
        }
    }
}
