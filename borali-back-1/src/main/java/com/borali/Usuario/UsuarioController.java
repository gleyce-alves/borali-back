package com.borali.Usuario;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/Usuario")
public class UsuarioController {
	
	
	private UsuarioDAO usuarioDAO;
	
	@PostMapping("/registrando")
	public String cadastroUsuario(EntidadeUsuario usuario) {
		System.out.println(usuario);
		this.usuarioDAO.save(usuario);
		return "home-buscar";
	}
	
	
	

}