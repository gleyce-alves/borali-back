package com.borali.cardapio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;	

@Controller
public class CardapioController {

	public List<Cardapio> lista = new ArrayList<Cardapio>();
	
	@Autowired
	private CardapioDAO cardapioDAO;
	
	@ModelAttribute("cardapio")
	public List<Cardapio> getLista(){
		return this.lista;
	}
	
	@PostMapping("/salvandoCardapio")
	public String registrado(Cardapio cardapio) {
		this.lista.add(cardapio);
		System.out.println(cardapio);
		this.cardapioDAO.save(cardapio);
		return "home-buscar";
	}
	
}
