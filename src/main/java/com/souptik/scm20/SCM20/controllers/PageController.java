package com.souptik.scm20.SCM20.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class PageController {

    @RequestMapping("/hello")//
    public String helloworld(Model model){

        model.addAttribute("name", "souptik karan");
        model.addAttribute("country","india");
        model.addAttribute("githubRepo","https://www.google.co.in/");
        return "Home";
    }

    //about route
    @RequestMapping("/about")
    public String about(Model model){
        model.addAttribute("isLogin", false);

        return "about";
    }

    //services route
    @RequestMapping("/service")
    public String service(){

        return "service";
    }
}
