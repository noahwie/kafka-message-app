package com.noahwie.producer_api.kafka;

import com.noahwie.producer_api.model.RestMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {
    @Autowired
    private KafkaTemplate<String, RestMessage> kafkaTemplate;

    public void send(RestMessage message) {
        kafkaTemplate.send("messages.v1", message);
    }
}
