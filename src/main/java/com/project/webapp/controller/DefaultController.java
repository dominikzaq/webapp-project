package com.project.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by domin on 5/24/17.
 */

@Controller
public class DefaultController {

    @GetMapping("/mainuser")
    public String welcome() {
        return "mainuser";
    }

    @GetMapping("/home")
    public String index() {
        return "home";
    }

    @GetMapping("/viewusers")
    public String viewUsers() {
        return "viewusers";
    }

    @GetMapping("/viewuser")
    public String viewUser() {
        return "viewuser";
    }

}
