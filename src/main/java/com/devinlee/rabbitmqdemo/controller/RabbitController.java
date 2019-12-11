package com.devinlee.rabbitmqdemo.controller;

import com.devinlee.rabbitmqdemo.service.IRabbitProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitController {

    @Autowired
    IRabbitProducerService rabbitProducerService;

    @GetMapping("/rabbitmq/fanout")
    public void fanout() {

        for (int i = 1; i <= 5; i++) {

            this.rabbitProducerService.producerFanout("发布/订阅模式下的第" + i + "条信息");
        }
    }

    @GetMapping("/rabbitmq/direct")
    public void direct() {

        for (int i = 1; i <= 5; i++) {

            this.rabbitProducerService.producerDirect("路由模式下的第" + i + "条信息");
        }
    }
}
