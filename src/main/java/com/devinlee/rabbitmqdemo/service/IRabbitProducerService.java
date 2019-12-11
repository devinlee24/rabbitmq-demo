package com.devinlee.rabbitmqdemo.service;

public interface IRabbitProducerService {

    void producerFanout(String message);

    void producerDirect(String message);
}
