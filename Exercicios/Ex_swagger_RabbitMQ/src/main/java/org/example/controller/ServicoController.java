package org.example.controller;

import org.example.constant.ConstanteServico;
import org.example.model.Servico;
import org.example.service.TipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


public class ServicoController {
    @Autowired
    private TipoService tipoService;

    @PostMapping(ConstanteServico.API_SRVC)
    public void salvarTipo(@RequestBody Servico tipo){
        tipoService.salvarTipo(tipo);
    }

    @GetMapping(ConstanteServico.API_SRVC)
    public List<Servico> findAll(){
      return  tipoService.ConsultarTipoTudo();
    }

    @PutMapping(ConstanteServico.API_SRVC)
    public void updateTipo (@RequestBody Servico tipo){
        tipoService.salvarTipo(tipo);
    }

    @DeleteMapping(ConstanteServico.API_SRVC + "/{id}")
    public void delete (@PathVariable("id")String id){
        tipoService.deletarTipo(id);
    }

    @GetMapping(ConstanteServico.API_SRVC + "/{id}")
    public Optional<Servico> findById(@PathVariable ("id")String id){
        return tipoService.ConsultarTipoPorId(id);
    }

}


