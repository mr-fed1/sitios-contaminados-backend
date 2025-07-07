
package com.example.alertas.repository;

import com.example.alertas.model.Actuacion;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ActuacionRepository extends MongoRepository<Actuacion, String> {
}
