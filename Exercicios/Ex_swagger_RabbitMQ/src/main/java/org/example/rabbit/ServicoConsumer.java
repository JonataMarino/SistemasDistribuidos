package org.example.rabbit;
import org.example.model.Atendimento;
import org.example.service.AtendimentoService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class ServicoConsumer {

    @Autowired
    private AtendimentoService clientService;

    @RabbitListener(queues = {"${queue.piada.descricao}"})
    public void receive (@Payload Atendimento atendimento){
        System.out.println(("ID: "+ atendimento.getId() + "\nGenero: " + atendimento.getDescricaoAtendimento()));

        //inserir dado no Mongo
        clientService.salvarAtendimento(atendimento);
    }
}
