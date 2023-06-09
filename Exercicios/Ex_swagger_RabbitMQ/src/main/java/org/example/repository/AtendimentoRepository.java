package org.example.repository;
import org.example.model.Atendimento;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtendimentoRepository extends MongoRepository<Atendimento, String> {

}
