package com.example.demo.repository;

import com.example.demo.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    //INTERFACE PARA INJEÇÃO DE DADOS
    //INTERFACE ENTRE A CONEXÃO COM O BD E O DADO EM SI
    //É QUEM FAZ A BUSCA POR DADOS
    
    @Query("select u from Usuario u where u.nome like %?1%")
    Usuario findByNomeQualquerCoisa(String nome);
    
    Usuario findByEmail(String email);
    
    Usuario findByNomeIgnoreCase(String nome);
}
