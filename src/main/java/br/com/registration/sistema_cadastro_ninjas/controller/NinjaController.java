package br.com.registration.sistema_cadastro_ninjas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/ninjas")
public class NinjaController {
    @GetMapping
    public String welcome() {
        return "Olá";
    }
}
