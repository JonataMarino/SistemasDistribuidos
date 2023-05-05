package org.example.repository;

import org.example.model.Piada;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PiadaRepository extends MongoRepository<Piada, String> {

}
