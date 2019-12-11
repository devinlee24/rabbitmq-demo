package com.devinlee.rabbitmqdemo.service.impl;

import com.devinlee.rabbitmqdemo.service.IRabbitConsumerService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 消息消费端
 */
@Component
public class RabbitConsumerServiceIml implements IRabbitConsumerService {

    @RabbitListener(queues = "fanoutQueueA")
    public void consumerFanoutA(String message) {

        System.out.println("消费者收到队列A中的消息:" + message);
    }

    @RabbitListener(queues = "fanoutQueueB")
    public void consumerFanoutB(String message) {

        System.out.println("消费者收到队列B中的消息:" + message);
    }

    @RabbitListener(queues = "directQueueC")
    public void consumerDirectC(String message) {

        System.out.println("消费者收到队列C中的消息:" + message);
    }

    @RabbitListener(queues = "directQueueD")
    public void consumerDirectD(String message) {

        System.out.println("消费者收到队列D中的消息:" + message);
    }
}
