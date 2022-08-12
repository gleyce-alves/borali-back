package com.borali.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.borali.entity.Usuario;

public interface UsuarioDAO extends JpaRepository<Usuario, Integer>{
	
	public Usuario findByNomeAndSenha(String nome, String senha);
	
	Usuario findByNome(String nome);
}
