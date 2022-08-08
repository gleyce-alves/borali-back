package br.com.borali.borali.Controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Controle {
    
    @GetMapping("")
    public String index(){
        return "index";
    }

    @GetMapping("home-buscar")
    public String home_buscar(){
        return "home-buscar";
    }

    @GetMapping("registrar")
    public String registro(){
        return "registroComedoria";
    }

    
}
