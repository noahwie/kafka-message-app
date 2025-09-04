package ch.noahwie.kafkamessageappbackend.controller;

import ch.noahwie.kafkamessageappbackend.dto.MessageDto;
import ch.noahwie.kafkamessageappbackend.service.MessageService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for managing notes.
 * Provides endpoints to create and read messages
 */
@RestController
@RequestMapping("/messages")
public class MessageController {
    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    /**
     * GET /messages
     * Returns all messages for user to see
     * @return list of messages as DTOs
     */
    @GetMapping
    public List<MessageDto> getMessages() {
        return messageService.getAllMessages();
    }

    /**
     * POST /messages
     * Creates a new message.
     * @param messageDto
     * @return created Message
     */
    @PostMapping
    public MessageDto saveMessage(@RequestBody @Valid MessageDto messageDto) {
        return messageService.createMessage(messageDto);
    }
}
