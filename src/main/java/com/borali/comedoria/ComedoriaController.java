package com.borali.comedoria;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;	

@Controller
public class ComedoriaController {

	public List<Comedoria> lista = new ArrayList<Comedoria>();
	
	@Autowired
	private ComedoriaDAO cardapioDAO;
	
	@ModelAttribute("cardapio")
	public List<Comedoria> getLista(){
		return this.lista;
	}
	
	@PostMapping("/registrarComedoria")
	public String registrado(Comedoria comedoria) {
		this.lista.add(comedoria);
		System.out.println(comedoria);
		this.cardapioDAO.save(comedoria);
		return "home-buscar";
	}
}
