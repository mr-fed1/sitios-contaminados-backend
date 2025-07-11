package com.example.alertas.controller;

import com.example.alertas.model.Usuario;
import com.example.alertas.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/login")
    public String login(@RequestBody Usuario credentials) {
        Optional<Usuario> user = usuarioRepository.findByUsernameAndPassword(
                credentials.getUsername(),
                credentials.getPassword()
        );

        return user.isPresent() ? "Login OK" : "Credenciales inválidas";
    }
}

