package org.example.rabbit;

import org.example.model.Piada;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PiadaProducer {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    public void send(Piada piada){
        rabbitTemplate.convertAndSend(this.queue.getName(), piada);
    }
}
