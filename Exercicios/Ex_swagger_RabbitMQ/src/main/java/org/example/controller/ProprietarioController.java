package org.example.controller;
import org.example.constant.ConstanteProprietario;
import org.example.model.Proprietario;
import org.example.service.ProprietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class ProprietarioController {
        @Autowired
        private ProprietarioService proprietarioService;

        @PostMapping(ConstanteProprietario.API_PROP)
        public void salvarProprietario(@RequestBody Proprietario proprietario){
            proprietarioService.salvarAutor(proprietario);
        }

        @GetMapping(ConstanteProprietario.API_PROP)
        public List<Proprietario> findAll(){
            return  proprietarioService.ConsultarTipoTudo();
        }

        @PutMapping(ConstanteProprietario.API_PROP)
        public void updateProprietario(@RequestBody Proprietario proprietario){
            proprietarioService.salvarAutor(proprietario);
        }

        @DeleteMapping(ConstanteProprietario.API_PROP + "/{id}")
        public void deleteProprietario(@PathVariable("id")String id){
            proprietarioService.deletarProprietario(id);
        }

        @GetMapping(ConstanteProprietario.API_PROP + "/{id}")
        public Optional<Proprietario> findById(@PathVariable ("id")String id){
            return proprietarioService.ConsultarProprietarioPorId(id);
        }

    }

