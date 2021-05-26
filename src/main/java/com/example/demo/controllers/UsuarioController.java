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
    //Para melhorar a performance, o autowired é utilizado que que as classes
    //Com o autowired, as classes só precisará ser instanciadas uma vez
    @Autowired
    private UsuarioService usuarioService;
    
    //A anotação @RequestMapping é usado para mapear solicitações da web em classes de
    //manipulador específicas e / ou métodos de manipulador.
    @RequestMapping("/usuario")
    public String getUsuarios(Model model){
        model.addAttribute("usuariosList", this.usuarioService.retorneUsuarios());
        return "usuario";
    }
}
