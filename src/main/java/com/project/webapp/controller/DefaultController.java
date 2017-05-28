package com.project.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by domin on 5/24/17.
 */

@Controller
public class DefaultController {

    @RequestMapping("/mainuser")
    public String welcome() {
        return "mainuser";
    }

    @RequestMapping("/home")
    public String index() {
        return "home";
    }

    @RequestMapping("/viewusers")
    public String viewUsers() {
        return "viewusers";
    }

    @RequestMapping("/viewuser")
    public String viewUser() {
        return "viewuser";
    }

}
