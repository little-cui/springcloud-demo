package com.example.demo.controllers;

import com.example.demo.feign.IProducer;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableCircuitBreaker
public class ConsumerController {
    @Autowired
    private IProducer producer;

    @HystrixCommand
    @RequestMapping("/consumer")
    public String consumer() {
        return producer.producer();
    }
}
