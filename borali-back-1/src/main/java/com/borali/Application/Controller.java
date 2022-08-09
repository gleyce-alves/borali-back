package com.borali.Application;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
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
	public String registro() {
		return "registro";
	}
	
	
}