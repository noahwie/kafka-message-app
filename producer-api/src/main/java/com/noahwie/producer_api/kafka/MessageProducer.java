package com.noahwie.producer_api.kafka;

import com.noahwie.producer_api.mapper.Mapper;
import com.noahwie.producer_api.model.KafkaMessage;
import com.noahwie.producer_api.model.RestMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {
    @Autowired
    private KafkaTemplate<String, KafkaMessage> kafkaTemplate;

    public void send(KafkaMessage kafkaMessage) {
        kafkaTemplate.send("messages.v1", kafkaMessage);
    }
}
