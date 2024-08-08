package com.webshop.project_java.webshop.controller;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homepageController {

    @RequestMapping("/")
    public String homePage() {
        return "index";
    }

    @RequestMapping("/home")
    public String homePageHome() {
        return "index";
    }

    @RequestMapping("/index")
    public String homePageIndex() {
        return "index";
    }


}
