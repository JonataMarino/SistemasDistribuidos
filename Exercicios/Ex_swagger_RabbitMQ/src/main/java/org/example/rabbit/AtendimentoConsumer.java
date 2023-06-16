package org.example.rabbit;
import org.example.model.Atendimento;
import org.example.service.AtendimentoService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class AtendimentoConsumer {

    @Autowired
    private AtendimentoService atendimentoService;

    @RabbitListener(queues = {"${queue.atendimento.descricaoAtendimento}"})
    public void receive (@Payload Atendimento atendimento){
        System.out.println(("ID: "+ atendimento.getId() + "\nAtendimento: " + atendimento.getDescricaoAtendimento()));

        //inserir dado no Mongo
        atendimentoService.salvarAtendimento(atendimento);
    }
}
