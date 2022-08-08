package com.borali.usuario;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {
	
	public List<Usuario> lista = new ArrayList<Usuario>();
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@ModelAttribute("usuario")
	public List<Usuario> getLista(){
		return this.lista;
	}
	
	@PostMapping("/registrando")
	public String registrado(Usuario usuario) {
		this.lista.add(usuario);
		System.out.println(usuario);
		this.usuarioDAO.save(usuario);
		return "home-buscar";
	}
}
