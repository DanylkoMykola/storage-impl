package com.danylko.storageimpl.presentstion.controller;

import com.danylko.storageimpl.model.service.producer.CustomerProducer;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-producer")
@AllArgsConstructor
public class ProducerController {

    private CustomerProducer producer;

    @PostMapping()
    public void create(@RequestBody String message) {
        producer.sendMessage(message);
    }
}
