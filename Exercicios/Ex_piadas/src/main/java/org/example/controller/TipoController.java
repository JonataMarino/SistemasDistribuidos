package org.example.controller;

import org.example.constant.ConstanteTipo;
import org.example.model.Tipo;
import org.example.service.TipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TipoController {
    @Autowired
    private TipoService tipoService;

    @PostMapping(ConstanteTipo.API_TIPO)
    public void salvarTipo(@RequestBody Tipo tipo){
        tipoService.salvarTipo(tipo);
    }

    @GetMapping(ConstanteTipo.API_TIPO)
    public List<Tipo> findAll(){
      return  tipoService.ConsultarTipoTudo();
    }

    @PutMapping(ConstanteTipo.API_TIPO)
    public void updateTipo (@RequestBody Tipo tipo){
        tipoService.salvarTipo(tipo);
    }

    @DeleteMapping(ConstanteTipo.API_TIPO + "/{id}")
    public void delete (@PathVariable("id")String id){
        tipoService.deletarTipo(id);
    }

    @GetMapping(ConstanteTipo.API_TIPO + "/{id}")
    public Optional<Tipo> findById(@PathVariable ("id")String id){
        return tipoService.ConsultarTipoPorId(id);
    }

}


