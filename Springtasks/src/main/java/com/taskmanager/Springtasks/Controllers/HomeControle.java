package com.taskmanager.Springtasks.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControle {
    @GetMapping("/")
    public String tasks1(){
        return "Tasks1/tasklist.html";
    }
    
}
