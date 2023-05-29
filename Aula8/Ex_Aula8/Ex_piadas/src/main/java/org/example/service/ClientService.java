package org.example.service;
import org.example.model.Piada;
import org.example.repository.PiadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private PiadaRepository piadaRepository;

    public void salvarPiada (Piada piada) {
        piadaRepository.insert(piada);
    }

    public void salvarPiadas (List<Piada> piadas) {
        piadas.forEach(piada -> piadaRepository.insert(piada));
    }

    public List<Piada> ConsultarTudo(){
        return piadaRepository.findAll();
    }

    public Optional <Piada> ConsultarPorId(String id){
        return piadaRepository.findById(id);
    }

    public void deletar(String id){
        piadaRepository.deleteById(id);
    }

    /*public void avaliarPiada(@PathVariable("id") String id, @RequestParam int avaliacao) {
        Optional<Piada> piadaOptional = piadaRepository.findById(id);
        if (piadaOptional.isPresent()) {
            Piada piada = piadaOptional.get();
            PiadaController.adicionarAvaliacao(avaliacao);
            clientService.salvarPiada(piada);*/
}


