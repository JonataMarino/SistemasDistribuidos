package org.example.service;
import org.example.model.Autor;
import org.example.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public void salvarAutor(Autor autor) {
        autorRepository.insert(autor);
    }

    public List<Autor> ConsultarTipoTudo(){
        return autorRepository.findAll();
    }

    public Optional<Autor> ConsultarAutorPorId(String id){
        return autorRepository.findById(id);
    }

    public void deletarAutor(String id){
        autorRepository.deleteById(id);
    }
}

