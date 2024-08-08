package com.webshop.project_java.webshop.controller.auth;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class authController {

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password, RedirectAttributes redirectAttributes, Model model) {
        if (email.equals("admin@gmail.com") && password.equals("admin")) {
            redirectAttributes.addFlashAttribute("condition", Boolean.FALSE);
            redirectAttributes.addFlashAttribute("message", "Login Successful");
            return "redirect:/account";
        } else {
            redirectAttributes.addFlashAttribute("error", "Invalid email or password");
            redirectAttributes.addFlashAttribute("condition", Boolean.TRUE);
            return "redirect:/login";
        }
    }
/*
    @PostMapping("/register")
    public String register() {
       /*  // Check if email is already registered
        // if yes, send back error
        if (email.equals("admin@gmail.com")) {
            redirectAttributes.addFlashAttribute("condition", Boolean.TRUE);
            redirectAttributes.addFlashAttribute("error", "Email already registered");
            return "redirect:/register";
        // else redirect to account page
    }

        else {
            redirectAttributes.addFlashAttribute("condition", Boolean.TRUE);
            redirectAttributes.addFlashAttribute("message", "Registration Successful");
            return "redirect:/account";
        }


        return "";
    }

    */

















        /* IMPORTANT NOTE:
        1. If you redirect, you cannot add anything after ex /login in the URL.
           Because the redirect will go to the URL you specified and the URL will be changed.
           Hence the "fetching" of thymeleaf attributes will not work because they are looking at /login

        2. @RequestBody will give error because the form is not sending a JSON object, it is sending a form data.
           The workaround for this is to add javascript to the form that will send the form data as JSON object.

        3.
         */



}
