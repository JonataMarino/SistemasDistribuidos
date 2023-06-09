package org.example.service;
import org.example.model.Servico;
import org.example.repository.TipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoService {
        @Autowired
        private TipoRepository tipoRepository;

        public void salvarTipo(Servico tipo) {
            tipoRepository.insert(tipo);
        }

        public List<Servico> ConsultarTipoTudo(){
            return tipoRepository.findAll();
        }

        public Optional<Servico> ConsultarTipoPorId(String id){
            return tipoRepository.findById(id);
        }

        public void deletarTipo(String id){
            tipoRepository.deleteById(id);
        }
    }
