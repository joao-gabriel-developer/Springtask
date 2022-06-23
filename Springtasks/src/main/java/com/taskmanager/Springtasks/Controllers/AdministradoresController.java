package com.taskmanager.Springtasks.Controllers;





import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import com.taskmanager.Springtasks.Controllers.Administrador;

import com.taskmanager.Springtasks.repositorio.AdministradoresRepo;


@Controller
public class AdministradoresController {

    @Autowired
    private AdministradoresRepo repo;

    //List administradores = new ArrayList<>();


    @GetMapping("/administradores")
    public String index(Model model){


        // @SuppressWarnings("unchecked")
        //dministradores =  List<Administrador>repo.findAll();
        //List<Administrador> administradores = (List<Administrador>)repo.findAll();
        @SuppressWarnings("rawtypes")
        List administradores = repo.findAll();
        

        model.addAttribute("Administradores", administradores);

        return "administradores/index";
    }
    
}
