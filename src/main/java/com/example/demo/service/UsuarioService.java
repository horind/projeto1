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
    
    //A CLASSE SERVICE DEVE CONTER OS METODOS QUE IRÃO RETORNAR DE
    //USERREPOSITORY O RESPECTIVO METODO. EX.:
    //O METODO retorneUsuarios() QUER RETORNAR TODOS OS REGISTROS DE USUARIOS
    //ENTÃO ELE TEM QUE RETORNAR O METODO FINDALL DO userRepository.
    public List<Usuario> retorneUsuarios(){
        return userRepository.findAll();
    }
}
