package org.project.controller;

import org.project.constant.Constante;
import org.project.model.Cliente;
import org.project.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Controller
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    public void inserir(Cliente cliente){
        clienteService.salvar(cliente);
    }

    public void deletar (Cliente cliente){
        clienteService.deletar(cliente);
    }

    public List<Cliente> consultarTodos(){
        return clienteService.consultarTudo();
    }
@GetMapping(Constante.API_URL + "/{id}")
    public Optional<Cliente> consultarPorId(@PathVariable Cliente cliente){
        return clienteService.consultarPorId(cliente);
    }
}
