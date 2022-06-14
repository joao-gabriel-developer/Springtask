package com.taskmanager.Springtasks.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.stereotype.Controller;

@Controller
public class HomeControle {
    @GetMapping("/")
    public String tasks1(Model model){
        model.addAttribute("dateofcreation", "Fourtheen of June of Two Thousand Twenty Two");


        return "Tasks1/tasklist.html";
    }
    
}
