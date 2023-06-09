package org.example.service;
import org.example.model.Atendimento;
import org.example.rabbit.ServicoProducer;
import org.example.repository.AtendimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AtendimentoService {
    @Autowired
    private AtendimentoRepository atendimentoRepository;

    @Autowired
    ServicoProducer servicoProducer;

    public void salvarAtendimento(Atendimento atendimento) {
        atendimentoRepository.insert(atendimento);
    }

    //public void salvarAtendimentos (List<Atendimento> atendimentos) {
    //    piadas.forEach(atendimentos -> atendimentoRepository.insert(atendimento));
    //}

    public List<Atendimento> ConsultarTudo(){
        return atendimentoRepository.findAll();
    }

    public Optional <Atendimento> ConsultarPorId(String id){
        return atendimentoRepository.findById(id);
    }

    public void deletar(String id){
        atendimentoRepository.deleteById(id);
    }


}


