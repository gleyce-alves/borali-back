package com.borali;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.borali.DAO.UsuarioDAO;
import com.borali.entity.Usuario;

@org.springframework.stereotype.Controller
public class Controller {
	
	// AQUI REDIRECIONAMOS TODAS AS TELAS
	
	// PAGINAS HOME
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@GetMapping("/")
	public String home3() {
		return "login";
	}
	
	@GetMapping("")
	public String index() {
		return "login";
	}
	
	@GetMapping("/home")
	public String home(Usuario usuario, HttpSession session) {
			session.setAttribute("usuarioDeslogado", usuario);
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
	public String login(Usuario usuario) {
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
	
	@GetMapping("/teste")
	public String teste() {
		return "teste";
	}
	
	@GetMapping("/verCardapio")
	public String cardapio() {
		return "cardapio";
	}
}
