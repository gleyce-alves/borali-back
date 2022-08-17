package com.borali.controller;

import com.borali.entities.ComedoriaEntity;
import com.borali.services.ComedoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ComedoriaController {

    @Autowired
    private ComedoriaService comedoriaService;

    @GetMapping("/listaComedoria")
    public String listaComedoria(Model model){
        List<ComedoriaEntity> comedorias = comedoriaService.listaComedoria();
        model.addAttribute("listaComedoria", comedorias);
        return "listaComedoria";
    }


    @PostMapping("/registroComedoria")
    public String cadastroComedoria(ComedoriaEntity comedoria){
        comedoriaService.save(comedoria);
        return "registroComedoria";
    }
}
