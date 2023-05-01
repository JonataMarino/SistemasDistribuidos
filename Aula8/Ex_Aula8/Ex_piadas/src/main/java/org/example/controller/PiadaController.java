package org.example.controller;

import org.example.constant.ConstanteClient;
import org.example.model.Piada;
import org.example.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PiadaController {
    @Autowired
    private ClientService clientService;

    @PostMapping(ConstanteClient.API_PIADA)
    public void salvarClient(@RequestBody Piada piada){
        clientService.salvarPiada(piada);
    }

    @GetMapping(ConstanteClient.API_PIADA)
    public List<Piada> findAll(){
        return  clientService.ConsultarTudo();
    }

    @PutMapping(ConstanteClient.API_PIADA)
    public void updateClient (@RequestBody Piada piada){
        clientService.salvarPiada(piada);
    }

    @DeleteMapping(ConstanteClient.API_PIADA + "/{id}")
    public void deleteClient (@PathVariable("id")String id){
        clientService.deletar(id);
    }


    @GetMapping(ConstanteClient.API_PIADA + "/{id}")
    public Optional<Piada> findById(@PathVariable ("id")String id){
        return clientService.ConsultarPorId(id);
    }
}
