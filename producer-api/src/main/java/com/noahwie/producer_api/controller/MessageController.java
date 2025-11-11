package com.noahwie.producer_api.controller;

import com.noahwie.producer_api.kafka.MessageProducer;
import com.noahwie.producer_api.mapper.Mapper;
import com.noahwie.producer_api.model.KafkaMessage;
import com.noahwie.producer_api.model.RestMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
    private MessageProducer messageProducer;

    @Autowired
    private Mapper mapper;

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody RestMessage restMessage) {
        KafkaMessage kafkaMessage = mapper.mapToKafkaMessage(restMessage);
        messageProducer.send(kafkaMessage);
        return ResponseEntity.ok("Message sent");
    }
}
