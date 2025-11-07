package com.noahwie.consumer_worker.Kafka;

import com.noahwie.consumer_worker.model.KafkaMessage;
import com.noahwie.consumer_worker.service.MessageService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
    @Autowired
    private MessageService messageService;

    @KafkaListener(topics = "messages.v1", groupId = "message", containerFactory = "kafkaListenerFactory")
    public void listen(@Payload KafkaMessage kafkaMessage) {
        messageService.saveMessage(kafkaMessage);
    }

}
