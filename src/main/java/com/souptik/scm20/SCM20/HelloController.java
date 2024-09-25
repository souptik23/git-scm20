package com.souptik.scm20.SCM20;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")//
    public String helloworld(){
        return "Hello";
    }

}
