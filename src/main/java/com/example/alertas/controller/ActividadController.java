
package com.example.alertas.controller;

import com.example.alertas.model.Actividad;
import com.example.alertas.repository.ActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actividad")
public class ActividadController {

    @Autowired
    private ActividadRepository actividadRepository;

    @GetMapping
    public List<Actividad> getAll() {
        return actividadRepository.findAll();
    }

    @PostMapping
    public Actividad create(@RequestBody Actividad actividad) {
        return actividadRepository.save(actividad);
    }

    @PutMapping("/{id}")
    public Actividad update(@PathVariable String id, @RequestBody Actividad updated) {
        updated.setId(id);
        return actividadRepository.save(updated);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        actividadRepository.deleteById(id);
    }
}
