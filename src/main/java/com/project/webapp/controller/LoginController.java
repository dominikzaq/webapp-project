package com.project.webapp.controller;

import com.project.webapp.domain.Login;
import com.project.webapp.domain.User;
import com.project.webapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**"'
 * Created by domin on 5/26/17.
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("login", new Login());
        return "login";
    }

    @PostMapping("/login")
    public String loginSubmit(@ModelAttribute Login login, Model model, HttpSession session) {
        User u = userService.getByEmailAndPassword(login.getEmail(), login.getPassword());
        session.setAttribute("user1", u);
        return u == null? "login" : "mainuser";
    }
}
