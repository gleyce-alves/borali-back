package com.borali.controller;

import com.borali.entities.UsuarioEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpSession;

@Controller
public class AppController {
	
	// AQUI REDIRECIONAMOS TODAS AS TELAS
	
	// PAGINAS HOME
	
	//@Autowired
	//private UsuarioDAO usuarioDAO;
	
	@GetMapping("/")
	public String home3() {
		return "login";
	}
	
	@GetMapping("")
	public String index() {
		return "login";
	}
	
	@GetMapping("/home")
	public String home(UsuarioEntity usuarioEntity, HttpSession session) {
			session.setAttribute("usuarioDeslogado", usuarioEntity);
			return "home-buscar";
	}
	
	// PERFIL DE USUARIO
	
	// QUEM SOMOS
	
	@GetMapping("/quemSomos")
	public String quemSomos() {
		return "quem-somos";
	}
	
	// PAGINA DE LOGIN
	
	@GetMapping("/login")
	public String login(UsuarioEntity usuario) {
		return "login";
	}
	
	@GetMapping("/recuperarSenha")
	public String recuperarSenha() {
		return "recuperarSenha";
	}
	
	// PAGINA DE CADASTRO
	
	@GetMapping("/registrar")
	public String registrar() {
		return "registro";
	}
	
	// PAGINA DE CADASTRO DE COMEDORIA
	
	@GetMapping("/registroComedoria")
	public String registrarComedoria() {
		return "registroComedoria";
	}
	
	// PAGINA DE TESTE

	@GetMapping("/perfilComedoria")
	public String perfilComedoria(){
		return "perfilComedoria";
	}

	@GetMapping("/perfilUsuario")
	public String perfilUsuario() {
		return "perfilUsuario";
	}
	
	@GetMapping("/verCardapio")
	public String cardapio() {
		return "cardapio";
	}
}
