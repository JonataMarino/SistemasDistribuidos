package org.example.repository;
import org.example.model.Autor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface AutorRepository {
    @Repository
    public interface PiadaRepository extends MongoRepository<Autor, String> {

    }

}
