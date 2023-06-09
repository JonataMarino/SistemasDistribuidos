package org.example.controller;

import org.example.constant.ConstanteClient;
import org.example.model.Piada;
import org.example.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class PiadaController {
    @Autowired
    private ClientService clientService;

    private Map<String, Integer> avaliacoesPorPiada = new HashMap<String, Integer>();
    private Map<String, Date> datasAvaliacoesPorPiada = new HashMap<>();
    private Map<String, Integer> autorDaPiada = new HashMap<String, Integer>();

    @PostMapping(ConstanteClient.API_PIADA)
    public void salvarPiada(@RequestBody Piada piada) {
        clientService.salvarPiada(piada);
    }

    @PostMapping(ConstanteClient.API_PIADA + "/list")
    public void salvarVariasPiadas(@RequestBody List<Piada> piada) {
        clientService.salvarPiadas(piada);
    }

    @PostMapping(ConstanteClient.API_PIADA + "/{id}/avaliar")
    public void avaliarPiada(@PathVariable("id") String id, @RequestParam int avaliacao) {
        Optional<Piada> piadaOptional = clientService.ConsultarPorId(id);
        if (piadaOptional.isPresent()) {
            avaliacoesPorPiada.put(id, avaliacao);
            datasAvaliacoesPorPiada.put(id, new Date());
        }
    }

    @GetMapping(ConstanteClient.API_PIADA)
    public List<Piada> findAll() {
        return clientService.ConsultarTudo();
    }

    @PutMapping(ConstanteClient.API_PIADA)
    public void updatePiada(@RequestBody Piada piada) {
        clientService.salvarPiada(piada);
    }

    @DeleteMapping(ConstanteClient.API_PIADA + "/{id}")
    public void deletePiada(@PathVariable("id") String id) {
        clientService.deletar(id);
    }


    @GetMapping(ConstanteClient.API_PIADA + "/{id}")
    public Optional<Piada> findById(@PathVariable("id") String id) {
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
