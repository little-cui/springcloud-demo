package com.example.demo.controllers;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableCircuitBreaker
public class ProducerController {

    @HystrixCommand
    @RequestMapping("/producer")
    public String producer() {
        return "Hello world";
    }
}
