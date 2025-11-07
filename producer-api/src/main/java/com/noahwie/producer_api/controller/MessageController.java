package com.noahwie.producer_api.controller;

import com.noahwie.producer_api.kafka.MessageProducer;
import com.noahwie.producer_api.model.RestMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
    private MessageProducer messageProducer;

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody RestMessage message) {
        messageProducer.send(message);
        return ResponseEntity.ok("Message sent");
    }
}
