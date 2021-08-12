package com.devilnguyen.demospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloSpringBoot {
    @GetMapping(value="/")
    public String home(){
        //rq.setAttribute("msg","Welcome to MY WORLD");
        return "layout/frontend";
    }

}
