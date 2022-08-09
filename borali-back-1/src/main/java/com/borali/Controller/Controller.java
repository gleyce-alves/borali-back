package com.borali.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	// AQUI REDIRECIONAMOS TODAS AS TELAS
	
	// PAGINAS HOME
	
	@GetMapping("/")
	public String home() {
		return "home-buscar";
	}
}
