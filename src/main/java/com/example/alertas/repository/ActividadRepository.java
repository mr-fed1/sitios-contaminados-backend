
package com.example.alertas.repository;

import com.example.alertas.model.Actividad;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ActividadRepository extends MongoRepository<Actividad, String> {}
