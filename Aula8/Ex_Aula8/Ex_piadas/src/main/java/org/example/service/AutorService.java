/*package org.example.service;
import org.example.model.Autor;
import org.example.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class AutorService {
    @Autowired
    private AutorRepository autoRepository;

    public void salvarPiada (Autor autor) {
        autoRepository.insert(autor);
    }

    public void salvarPiadas (List<Autor> autors) {
        autors.forEach(autors -> autoRepository.insert(autors));
    }

    public List<Autor> ConsultarTudo(){
        return autoRepository.findAll();
    }

    public Optional<Autor> ConsultarPorId(String id){
        return autoRepository.findById(id);
    }

    public void deletar(String id){
        autoRepository.deleteById(id);
    }
}
*/