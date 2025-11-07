package com.noahwie.producer_api.controller;

import com.noahwie.producer_api.model.RestMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageController {
    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody RestMessage message) {
        // Message should be inserted by message producer
        return ResponseEntity.ok("Message sent");
    }
}
