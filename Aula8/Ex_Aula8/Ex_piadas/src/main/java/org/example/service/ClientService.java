package org.example.service;


import org.example.model.Piada;
import org.example.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public void salvarPiada (Piada piada) {
        clientRepository.insert(piada);
    }

    public List<Piada> ConsultarTudo(){
        return clientRepository.findAll();
    }

    public Optional <Piada> ConsultarPorId(String id){
        return clientRepository.findById(id);
    }

    public void deletar(String id){
        clientRepository.deleteById(id);
    }
}
