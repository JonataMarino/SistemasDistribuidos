package org.example.rabbit;
import org.example.model.Piada;
import org.example.service.ClientService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class PiadaConsumer {

    @Autowired
    private ClientService clientService;

    @RabbitListener(queues = {"${queue.piada.descricao}"})
    public void receive (@Payload Piada piada){
        System.out.println(("ID: "+ piada.getId() + "\nGenero: " + piada.getDescricao()));

        //inserir dado no Mongo
        clientService.salvarPiada(piada);
    }
}
