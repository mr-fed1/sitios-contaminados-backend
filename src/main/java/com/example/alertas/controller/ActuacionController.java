
package com.example.alertas.controller;

import com.example.alertas.model.Actuacion;
import com.example.alertas.repository.ActuacionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actuaciones")
@CrossOrigin("*")
public class ActuacionController {

    private final ActuacionRepository repository;

    public ActuacionController(ActuacionRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Actuacion> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Actuacion obtener(@PathVariable String id) {
        return repository.findById(id).orElse(null);
    }
}
