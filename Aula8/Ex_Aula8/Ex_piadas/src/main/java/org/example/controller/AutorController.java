/*package org.example.controller;
import org.example.constant.ConstanteTipo;
import org.example.model.Autor;
import org.example.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class AutorController {
        @Autowired
        private AutorService autorService;

        @PostMapping(ConstanteTipo.API_AUTOR)
        public void salvarTipo(@RequestBody Autor autor){
            autorService.salvarTipo(autor);
        }

        @GetMapping(ConstanteTipo.API_TIPO)
        public List<Autor> findAll(){
            return  autorService.ConsultarTipoTudo();
        }

        @PutMapping(ConstanteTipo.API_TIPO)
        public void updateTipo (@RequestBody Autor autor){
            autorService.salvarTipo(tipo);
        }

        @DeleteMapping(ConstanteTipo.API_TIPO + "/{id}")
        public void delete (@PathVariable("id")String id){
            autorService.deletarTipo(id);
        }

        @GetMapping(ConstanteTipo.API_TIPO + "/{id}")
        public Optional<Autor> findById(@PathVariable ("id")String id){
            return autorService.ConsultarTipoPorId(id);
        }

    }
}
*/