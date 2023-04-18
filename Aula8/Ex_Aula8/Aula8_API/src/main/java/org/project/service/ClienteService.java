package org.project.service;

import org.project.model.Cliente;
import org.project.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    public void salvar (Cliente cliente){
        clienteRepository.insert(cliente);
    }

    public void deletar (Cliente cliente){
        clienteRepository.deleteById(cliente.getId());
    }

    public List<Cliente> consultarTudo(){
        return clienteRepository.findAll();
    }

    public Optional<Cliente> consultarPorId(Cliente cliente){
        return clienteRepository.findById(cliente.getId());
    }

}
