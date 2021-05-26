package com.example.demo.config;

import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent>{
//     CLASSE QUE IMPLEMENTA A INTERFACE PARA INJEÇÃO DE DADOS AO RODAR O PROJETO
    
    @Autowired
    UsuarioRepository usuarioRepository;
    
    @Override
    public void onApplicationEvent(ContextRefreshedEvent e) {
        
        List<Usuario> usuarios = usuarioRepository.findAll();
        
        if(usuarios.isEmpty()){
            createUsuario("Matheus", "matheus@gmail.com");
            createUsuario("Joao", "joao@gmail.com");
            createUsuario("Maria", "maria@gmail.com");
        }
        
        Usuario usuario = usuarioRepository.findByNomeIgnoreCase("matheus");
        System.out.println(usuario.getNome());
        
        //PEGAR ID DE REGISTRO E IMPRIMIR
        //Usuario usuario = usuarioRepository.getOne(1L);
        //System.out.println(usuario.getNome());
        
        //ALTERAR CAMPO DE REGISTRO
        //usuario.setNome("Matheus Amorim");
        //usuarioRepository.save(usuario);
        
        //DELETAR REGISTRO POR ID
        //usuarioRepository.deleteById(2L);
        
    }
    
    public void createUsuario(String nome, String email){
        Usuario usuario = new Usuario(nome, email);
        usuarioRepository.save(usuario);
    }

}
