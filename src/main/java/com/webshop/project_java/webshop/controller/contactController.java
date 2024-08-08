package com.webshop.project_java.webshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class contactController {

    @RequestMapping("/contact")
    public String homePageIndex() {
        return "contact";
    }

}
