package com.devinlee.rabbitmqdemo.service;

public interface IRabbitConsumerService {

    void consumerFanoutA(String message);

    void consumerFanoutB(String message);

    void consumerDirectC(String message);

    void consumerDirectD(String message);
}
