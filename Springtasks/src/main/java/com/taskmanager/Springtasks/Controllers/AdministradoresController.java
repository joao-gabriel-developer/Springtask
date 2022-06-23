package com.taskmanager.Springtasks.Controllers;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.taskmanager.Springtasks.repositorio.AdministradoresRepo;


@Controller
public class AdministradoresController {

    @Autowired
    private AdministradoresRepo repo;


    @GetMapping("/administradores")
    public String index(Model model){

        // @SuppressWarnings("unchecked")
        // List<Administrador> administradores = (List<Administrador>)repo.findAll();
        List<Administrador> administradores = (List<Administrador>)repo.findAll();
        model.addAttribute("Administradores", administradores);

        return "administradores/index";
    }
    
}
