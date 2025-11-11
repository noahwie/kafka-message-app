package com.noahwie.producer_api.mapper;

import com.noahwie.producer_api.model.KafkaMessage;
import com.noahwie.producer_api.model.RestMessage;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    public KafkaMessage mapToKafkaMessage(RestMessage restMessage) {
        KafkaMessage kafkaMessage = new KafkaMessage();
        kafkaMessage.setId(restMessage.getMessageId());
        kafkaMessage.setMessage(restMessage.getMessage());
        return kafkaMessage;
    }
}
