package com.borali;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	@GetMapping("")
	public String index() {
		return "home-buscar";
	}
	
	@GetMapping("/home")
	public String home2() {
		return "home-buscar";
	}
	
	@GetMapping("/perfilUsuario")
	public String perfilUsuario() {
		return "perfilUsuario(alternativo)";
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
	
	@GetMapping("/registrar")
	public String registrar() {
		return "registro(alternativo)";
	}
	
	@GetMapping("/registroComedoria")
	public String registrarComedoria() {
		return "registroComedoria";
	}
}
