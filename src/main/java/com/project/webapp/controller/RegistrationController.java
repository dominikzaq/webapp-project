package com.project.webapp.controller;

import com.project.webapp.domain.User;
import com.project.webapp.repository.UserRepository;
import com.project.webapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.PostConstruct;

/**
 * Created by domin on 5/26/17.
 */
@Controller
public class RegistrationController {

    @Autowired
    UserService userService;

    @GetMapping("/createuser")
    public String creatingForm(Model model) {
        model.addAttribute("user", new User());
        return "createuser";
    }

    @PostMapping("/createuser")
    public String creatingSubmit(@ModelAttribute("user") User user) {
        System.out.println(user);
        userService.saveUser(user);
        return "login";
    }
}
