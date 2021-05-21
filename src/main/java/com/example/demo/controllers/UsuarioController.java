package com.example.demo.controllers;

import com.example.demo.repository.UsuarioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsuarioController {
    private UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    
    @RequestMapping("/usuario")
    public String getUsuarios(Model model){
        model.addAttribute("usuariosList", this.usuarioRepository.findAll());
        return "usuario";
    }
}
