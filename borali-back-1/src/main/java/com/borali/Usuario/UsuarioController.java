package com.borali.Usuario;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UsuarioController {
	
	
	private final UsuarioDAO usuarioDAO;
	public UsuarioController (UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}
	
	
	@PostMapping("/registrando")
	public String cadastroUsuario(EntidadeUsuario usuario) {
		System.out.println(usuario);
		this.usuarioDAO.save(usuario);
		return "home-buscar";
	}
	
	
	

}