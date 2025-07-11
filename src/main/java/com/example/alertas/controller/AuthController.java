package com.example.alertas.controller;

import com.example.alertas.model.Usuario;
import com.example.alertas.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        return usuarioRepository.findByUsernameAndPassword(username, password)
                .map(user -> "Login OK")
                .orElse("Credenciales inválidas");
    }
}
