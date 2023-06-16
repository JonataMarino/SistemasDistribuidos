package org.example.service;
import org.example.model.Atendimento;
import org.example.rabbit.AtendimentoProducer;
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
    AtendimentoProducer atendimentoProducer;

    public void sendAtendimentoRabbit(Atendimento atendimento){
        atendimentoProducer.send(atendimento);
    }
    public void salvarAtendimento(Atendimento atendimento) {
        atendimentoRepository.save(atendimento);
    }

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


