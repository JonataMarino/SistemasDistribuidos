package org.example.controller;
import org.example.constant.ConstanteAutor;
import org.example.model.Autor;
import org.example.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class AutorController {
        @Autowired
        private AutorService autorService;

        @PostMapping(ConstanteAutor.API_AUTOR)
        public void salvarAutor(@RequestBody Autor autor){
            autorService.salvarAutor(autor);
        }

        @GetMapping(ConstanteAutor.API_AUTOR)
        public List<Autor> findAll(){
            return  autorService.ConsultarTipoTudo();
        }

        @PutMapping(ConstanteAutor.API_AUTOR)
        public void updateAutor (@RequestBody Autor autor){
            autorService.salvarAutor(autor);
        }

        @DeleteMapping(ConstanteAutor.API_AUTOR + "/{id}")
        public void delete (@PathVariable("id")String id){
            autorService.deletarAutor(id);
        }

        @GetMapping(ConstanteAutor.API_AUTOR + "/{id}")
        public Optional<Autor> findById(@PathVariable ("id")String id){
            return autorService.ConsultarAutorPorId(id);
        }

    }

