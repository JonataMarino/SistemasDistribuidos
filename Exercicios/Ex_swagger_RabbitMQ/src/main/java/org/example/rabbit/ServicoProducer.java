package org.example.rabbit;

import org.example.model.Atendimento;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoProducer {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    public void send(Atendimento piada){
        rabbitTemplate.convertAndSend(this.queue.getName(), piada);
    }
}
