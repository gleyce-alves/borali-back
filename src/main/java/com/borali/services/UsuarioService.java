package com.borali.services;

import com.borali.entities.ComedoriaEntity;
import com.borali.entities.UsuarioEntity;
import com.borali.repositories.ComedoriaDAO;
import com.borali.repositories.UsuarioDAO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UsuarioService {

    private UsuarioDAO repository;

    public Optional<UsuarioEntity> findByCpf(String nome) {
        return this.repository.findByCpf(nome);
    }

    public void save(UsuarioEntity usuario) {
        this.repository.save(usuario);
    }

    public Optional<UsuarioEntity> findByEmailAndSenha(String email, String senha) {
        return this.repository.findByEmailAndSenha(email, senha);
    }

    public Optional<UsuarioEntity> findByNomeAndSenha(String nome, String senha){
        return this.repository.findByNomeAndSenha(nome, senha);
    }


}

