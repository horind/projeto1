package com.example.demo.controllers;

import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// A CLASSE CONTROLE É QUEM RECEBE TODOS OS REQUEST.

@Controller
public class UsuarioController {
    //Com o autowired é possivel injetar o objeto e
    //utiliza-lo sem instancia-lo (Injeção de dependencia)
    @Autowired
    private UsuarioService usuarioService;
    
    @RequestMapping("/usuario")
    public String getUsuarios(Model model){
        model.addAttribute("usuariosList", this.usuarioService.findAll());
        return "usuario";
    }
}
