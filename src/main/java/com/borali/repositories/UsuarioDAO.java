package com.borali.repositories;

import com.borali.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioDAO extends JpaRepository<UsuarioEntity, Integer> {

    Optional<UsuarioEntity> findByEmailAndSenha(String email, String senha);
    Optional<UsuarioEntity> findByNomeAndSenha(String nome, String senha);

    Optional<UsuarioEntity> findByCpf(String cpf);

}
