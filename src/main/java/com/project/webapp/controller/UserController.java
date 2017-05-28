package com.project.webapp.controller;

import com.project.webapp.domain.User;
import com.project.webapp.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by domin on 5/23/17.
 */

@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(method = RequestMethod.PUT, value = "/search")
    public void addUser(Model model) {
        model.addAttribute("userForm",new User());
    }

    public void getUser() {}

    public void removeUser() {
        userService.removeUser();
    }

    public void insertUser() {}

    public void updateUser() {}


    @RequestMapping(method = RequestMethod.GET, value = "/search")
    public ModelAndView getAllUsers() {
        ModelAndView mav = new ModelAndView("/search");
        mav.addObject("users", userService.getAllUsers());
        return mav;
    }

    @GetMapping(value = "/searchName")
    String findByName(String name) {
        userService.getByName(name);
        return "";
    }

    @GetMapping(value = "/searchEmail")
    String findByEmail(String email){
        userService.getByEmail(email);
        return "";
    }

    @GetMapping(value = "/searchCountry")
    String findByCountry(String country){
        userService.getByCountry(country);
        return "";
    }
}