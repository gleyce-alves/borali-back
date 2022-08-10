package com.borali;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.borali.Usuario.UsuarioDAO;
import com.borali.model.SaveRegistro;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	// AQUI REDIRECIONAMOS TODAS AS TELAS
	
	// PAGINAS HOME
	
	@GetMapping("/registroComedoria")
	public String registroComedoria() {
		return "registroComedoria";
	}
	
	@GetMapping("/home")
	public String home() {
		return "home-buscar";
	}
	
	@GetMapping("/")
	public String buscar() {
		return "home-buscar";
	}
	
	@GetMapping("/perfilUsuario")
	public String perfilUsuario() {
		return "perfilUsuario";
	}
	
	@GetMapping("/quemSomos")
	public String quemSomos() {
		return "quem-somos";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/recuperarSenha")
	public String recuperarSenha() {
		return "recuperarSenha";
	}
	
	@GetMapping("/registro")
	public String registro(SaveRegistro saveregistro) {
		return "registro";
	}
	
	@PostMapping("salvarRegistro")
	public String salvarRegistro (SaveRegistro saveregistro) {
		this.usuarioDAO.save(saveregistro);
		return "/registro";
	}
}