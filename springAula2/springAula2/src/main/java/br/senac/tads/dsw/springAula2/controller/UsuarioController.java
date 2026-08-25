package br.senac.tads.dsw.springAula2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    
    @GetMapping("/ping")
    public String testarConexao(){
        return "Api de usuarios esta online e funcionando";
    }
}
