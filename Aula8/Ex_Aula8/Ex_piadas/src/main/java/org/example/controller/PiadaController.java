package org.example.controller;

import org.example.constant.ConstanteClient;
import org.example.model.Piada;
import org.example.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@RestController
public class PiadaController {
    @Autowired
    private ClientService clientService;

    @PostMapping(ConstanteClient.API_PIADA)
    public void salvarPiada(@RequestBody Piada piada){
        clientService.salvarPiada(piada);
    }

    @GetMapping(ConstanteClient.API_PIADA)
    public List<Piada> findAll(){
        return  clientService.ConsultarTudo();
    }

    @PutMapping(ConstanteClient.API_PIADA)
    public void updatePiada (@RequestBody Piada piada){
        clientService.salvarPiada(piada);
    }

    @DeleteMapping(ConstanteClient.API_PIADA + "/{id}")
    public void deletePiada (@PathVariable("id")String id){
        clientService.deletar(id);
    }


    @GetMapping(ConstanteClient.API_PIADA + "/{id}")
    public Optional<Piada> findById(@PathVariable ("id")String id){
        return clientService.ConsultarPorId(id);
    }

    @GetMapping(ConstanteClient.API_PIADA + "/sorteio")
    public Piada sorteioPiada() {
        List<Piada> piadas = clientService.ConsultarTudo();
        Random random = new Random();
        int index = random.nextInt(piadas.size());
        return piadas.get(index);
    }
}
