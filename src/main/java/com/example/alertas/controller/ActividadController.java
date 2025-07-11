
package com.example.alertas.controller;

import com.example.alertas.model.Actividad;
import com.example.alertas.repository.ActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/actividad")
public class ActividadController {

    @Autowired
    private ActividadRepository repository;

    @GetMapping
    public List<Actividad> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Actividad> getById(@PathVariable String id) {
        return repository.findById(id);
    }

    @PostMapping
    public Actividad create(@RequestBody Actividad actividad) {
        return repository.save(actividad);
    }

    @PutMapping("/{id}")
    public Actividad update(@PathVariable String id, @RequestBody Actividad actividad) {
        actividad.setId(id);
        return repository.save(actividad);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repository.deleteById(id);
    }
}
