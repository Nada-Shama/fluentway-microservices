package com.fluentway.userservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserViewController {

    @GetMapping("/ui")
    public String showUI() {
        return "ui";
    }
}
