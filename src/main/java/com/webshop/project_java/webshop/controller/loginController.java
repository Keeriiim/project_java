package com.webshop.project_java.webshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {

    @RequestMapping("/login")
    public String homePageIndex(Model model) {
        return "login";
    }
}
