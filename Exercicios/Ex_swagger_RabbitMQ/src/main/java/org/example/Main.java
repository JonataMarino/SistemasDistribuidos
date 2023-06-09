package org.example;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class Main {

    @Value("${queue.piada.descricao}")
    private String piadaQueue;
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
        System.out.println("Na minha máquina Funciona");
    }
        @Bean
        public Queue queue(){
            return new Queue(piadaQueue, true);
        }
    }
