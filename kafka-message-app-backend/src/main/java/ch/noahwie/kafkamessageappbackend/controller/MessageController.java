package ch.noahwie.kafkamessageappbackend.controller;

import ch.noahwie.kafkamessageappbackend.dto.MessageDto;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST controller for managing notes.
 * Provides endpoints to create and read messages
 */
@RestController
public class MessageController {
    /*private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }*/

    /**
     * GET /messages
     * Returns all messages for user to see
     * @return list of messages as DTOs
     */
    @GetMapping("/messages")
    public List<MessageDto> getMessages() {
        return messageService.getAllMessages();
    }

    /**
     * POST /messages
     * Creates a new message.
     * @param messageDto
     * @return created Message
     */
    @PostMapping("/messages")
    public MessageDto saveMessage(@RequestBody @Valid MessageDto messageDto) {
        return messageService.createNote(messageDto);
    }
}
