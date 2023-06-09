package org.example.repository;
import org.example.model.Servico;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoRepository extends MongoRepository<Servico, String> {
}
