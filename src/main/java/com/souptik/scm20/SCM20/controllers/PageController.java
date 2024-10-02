package com.souptik.scm20.SCM20.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class PageController {

    @RequestMapping("/home")//
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

    @RequestMapping("/contact")
    public String contact(){
        return "contact";
    }

    @RequestMapping("/login")
    public String gotoLoginPage(){
        return "login";
    }

    @RequestMapping("/signup")
    public String gotoSignupPage(){
        return "signup";
    }
}
