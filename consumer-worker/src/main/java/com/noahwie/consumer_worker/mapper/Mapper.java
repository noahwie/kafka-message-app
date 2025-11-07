package com.noahwie.consumer_worker.mapper;

import com.noahwie.consumer_worker.model.KafkaMessage;
import com.noahwie.consumer_worker.model.Message;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    public Message mapToMessage(KafkaMessage kafkaMessage) {
        Message message = new Message();
        message.setMessageId(kafkaMessage.getId());
        message.setMessage(kafkaMessage.getMessage());
        return message;
    }

}
