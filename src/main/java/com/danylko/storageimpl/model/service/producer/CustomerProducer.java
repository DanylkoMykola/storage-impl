package com.danylko.storageimpl.model.service.producer;

import org.springframework.stereotype.Component;

@Component
public interface CustomerProducer {
    void sendMessage(String message);
}
