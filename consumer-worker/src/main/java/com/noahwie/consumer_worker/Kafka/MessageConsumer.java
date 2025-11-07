package com.noahwie.consumer_worker.Kafka;

import com.noahwie.consumer_worker.model.KafkaMessage;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
// inject service here

    @KafkaListener(topics = "messages.v1", groupId = "message", containerFactory = "kafkaListenerFactory")
    public void listen(@Payload KafkaMessage kafkaMessage) {
        // delegate to add message to db service here
    }

}
