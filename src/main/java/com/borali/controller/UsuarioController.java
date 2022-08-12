package com.borali.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.borali.DAO.UsuarioDAO;
import com.borali.entity.Usuario;

@Controller
public class UsuarioController {
	
	private List<Usuario> lista = new ArrayList<Usuario>();
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@ModelAttribute("usuarios")
	public List<Usuario> getLista(){
		return this.lista;
	}
	
	@PostMapping("/registrando")
	public String registrando(Usuario usuario) {
		this.lista.add(usuario);
		System.out.println(usuario);
		this.usuarioDAO.save(usuario);
		return "home-buscar";
	}
	
}
