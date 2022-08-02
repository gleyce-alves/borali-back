package com.borali.homeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistroController {
	
	@GetMapping("/")
	public String registro() {
		return "registro";
	}
	
	@PostMapping("/regUser")
	public String regUser(Registro user){
		if(user.getConfSenha().equals(user.getSenha())) {
			System.out.println("");
			return "/registro";
		}else {
			return "registroErro";
		}
	}

}
