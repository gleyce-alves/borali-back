package com.borali.controller;

import com.borali.entities.UsuarioEntity;
import com.borali.services.UsuarioService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;


@Controller
@AllArgsConstructor
public class UsuarioController {

    private UsuarioService usuarioService;


    public String registrado() {
        return "home-buscar";
    }

    @PostMapping("/registrando")
    public String validarRegistro(UsuarioEntity usuarioEntity, RedirectAttributes ra) {
        var userAlreadyExists = usuarioService.findByCpf(usuarioEntity.getCpf());

        if (userAlreadyExists.isEmpty()) {
            usuarioService.save(usuarioEntity);
            ra.addFlashAttribute("usuarioCadastrado", usuarioEntity);
            return "redirect:/home";
        } else {
            return "login";
        }

    }

    @PostMapping("/logando")
    public String validarLogin(UsuarioEntity usuarioEntity, HttpSession session, RedirectAttributes ra) {
        var userAlreadyExists = usuarioService.findByNomeAndSenha(usuarioEntity.getNome(), usuarioEntity.getSenha());

        if (userAlreadyExists.isEmpty()){
            ra.addFlashAttribute("mensagem", "Usuario ou senha incorretos!");
            return "/login";
        }
        else {
            session.setAttribute("usuarioLogado", usuarioEntity);
            ra.addFlashAttribute("usuarioLogado", usuarioEntity);
            return "redirect:/home";
        }
    }
}