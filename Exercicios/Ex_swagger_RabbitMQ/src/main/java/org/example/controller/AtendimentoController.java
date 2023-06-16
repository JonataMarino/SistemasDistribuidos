package org.example.controller;
import org.example.constant.ConstanteAtendimento;
import org.example.model.Atendimento;
import org.example.service.AtendimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class AtendimentoController {
    @Autowired
    private AtendimentoService atendimentoService;

    @PostMapping(ConstanteAtendimento.API_ATND)
    public void salvarAtendimento(@RequestBody Atendimento atendimento) {
        atendimentoService.sendAtendimentoRabbit(atendimento);
    }
  /*  @PostMapping
    public void sendAtendimentoRabbit(Atendimento atendimento){
        atendimentoService.sendAtendimentoRabbit(atendimento);
    } */
    @GetMapping(ConstanteAtendimento.API_ATND)
    public List<Atendimento> findAll() {
        return atendimentoService.ConsultarTudo();
    }

    @PutMapping(ConstanteAtendimento.API_ATND)
    public void updateAtendimento(@RequestBody Atendimento atendimento) {
        atendimentoService.salvarAtendimento(atendimento);
    }

    @DeleteMapping(ConstanteAtendimento.API_ATND + "/{id}")
    public void deleteAtendimento(@PathVariable("id") String id) {
        atendimentoService.deletar(id);
    }


    @GetMapping(ConstanteAtendimento.API_ATND + "/{id}")
    public Optional<Atendimento> findById(@PathVariable("id") String id) {
        return atendimentoService.ConsultarPorId(id);
    }

}