package com.example.alertas.controller;

import com.example.alertas.model.Usuario;
import com.example.alertas.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UsuarioRepository usuarioRepository;

 @PostMapping("/login")
public ResponseEntity<String> login(@RequestBody Map<String, Object> payload) {
    System.out.println("Payload recibido: " + payload);
    return ResponseEntity.ok("OK");
}
}

