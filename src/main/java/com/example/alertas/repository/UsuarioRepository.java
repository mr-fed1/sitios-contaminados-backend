package com.example.alertas.repository;

import com.example.alertas.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    Optional<Usuario> findByUsernameAndPassword(String username, String password);
}
