package com.fluentway.userservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserViewController {
    @GetMapping("/")
    public String home() {
        return "ui"; // renders ui.html
    }
}
