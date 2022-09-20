package com.danylko.storageimpl.model.service.consumer.impl;

import com.danylko.storageimpl.model.service.consumer.CustomerConsumer;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CustomerConsumerImpl implements CustomerConsumer {

    @KafkaListener( containerFactory = "kafkaListenerContainerFactory", topics = {"customers"})
    public void listenerGroup_1(String message) {
        System.out.println("Received Message in group group_1: " + message);
    }
    @KafkaListener(containerFactory = "kafkaListenerContainerFactory", topics = {"customers"}, groupId = "group_1")
    public void listenWithHeaders(
            @Payload String message,
            @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
        System.out.println(
                "Received Message: " + message
                        + "from partition: " + partition);
    }
}
