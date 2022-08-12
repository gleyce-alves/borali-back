package com.borali.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.borali.DAO.UsuarioDAO;
import com.borali.entity.Usuario;

@org.springframework.stereotype.Controller
public class LoginController {
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	// LOGIN
	
	@PostMapping("/logando")
	public String logar(Usuario usuario, HttpSession session, RedirectAttributes ra) {
		
		usuario = this.usuarioDAO.findByNomeAndSenha(usuario.getNome(), usuario.getSenha());
		
		if(usuario != null) {
			session.setAttribute("usuarioLogado", usuario);
			return "redirect:/home";
		}else{
			ra.addFlashAttribute("mensagem", "Login"
					+ " ou senha inválidos!");
			return "redirect:/login";
		}
	}
	
	// LOGOUT
	
	@PostMapping("/logout")
	public String logOut(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
