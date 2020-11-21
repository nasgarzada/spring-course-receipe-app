package io.course.receipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("")
    public String getIndexPage(){
//        System.out.println("Getting....");
        return "index";
    }
}
