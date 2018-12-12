package com.example.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "producer")
public interface IProducer {
    @RequestMapping(method = RequestMethod.GET, value = "/producer")
    String producer();
}
