package org.example.service;
import org.example.model.Proprietario;
import org.example.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProprietarioService {
    @Autowired
    private AutorRepository autorRepository;

    public void salvarAutor(Proprietario autor) {
        autorRepository.insert(autor);
    }

    public List<Proprietario> ConsultarTipoTudo(){
        return autorRepository.findAll();
    }

    public Optional<Proprietario> ConsultarProprietarioPorId(String id){
        return autorRepository.findById(id);
    }

    public void deletarProprietario(String id){
        autorRepository.deleteById(id);
    }
}

