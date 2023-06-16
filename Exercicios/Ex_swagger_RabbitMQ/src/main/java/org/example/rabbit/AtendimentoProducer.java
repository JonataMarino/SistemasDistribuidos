package org.example.rabbit;

import org.example.model.Atendimento;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtendimentoProducer {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    public void send(Atendimento atendimento){
        rabbitTemplate.convertAndSend(this.queue.getName(), atendimento);
    }
}
