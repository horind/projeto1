package com.example.demo.service;

import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// A CLASSE SERVICE CUIDA DAS REGRAS DE NEGOCIO

@Service
public class UsuarioService {
    
    @Autowired
    UsuarioRepository userRepository;
    
    public List<Usuario> findAll(){
        return userRepository.findAll();
    }
}
