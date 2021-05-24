package com.example.demo.controllers;

import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// A CLASSE CONTROLE É QUEM RECEBE TODOS OS REQUEST
// E ENVIA PARA QUEM VAI TRATAR OS DADOS

@Controller
public class UsuarioController {
    //Com o autowired é possivel injetar o objeto e
    //utiliza-lo sem precisar instancia-lo (Injeção de dependencia)
    @Autowired
    private UsuarioService usuarioService;
    
    //A anotação @RequestMapping é usado para mapear solicitações da web em classes de
    //manipulador específicas e / ou métodos de manipulador.
    @RequestMapping("/usuario")
    public String getUsuarios(Model model){
        model.addAttribute("usuariosList", this.usuarioService.findAll());
        return "usuario";
    }
}
