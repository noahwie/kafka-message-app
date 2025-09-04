package ch.noahwie.kafkamessageappbackend.service;

import ch.noahwie.kafkamessageappbackend.dto.MessageDto;
import ch.noahwie.kafkamessageappbackend.mapper.MessageMapper;
import ch.noahwie.kafkamessageappbackend.model.Message;
import ch.noahwie.kafkamessageappbackend.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Service class responsible for handling, message-related logic.
 * Supports creating and retrieving messages.
 */
@Service
public class MessageService {
    private final MessageRepository messageRepository;
    private final MessageMapper messageMapper;

    public MessageService(MessageRepository messageRepository, MessageMapper messageMapper) {
        this.messageRepository = messageRepository;
        this.messageMapper = messageMapper;
    }

    /**
     * creates a new message from the given messageDto
     * @param messageDto
     * @return the saved message Dto
     */
    public MessageDto createMessage(MessageDto messageDto) {
        Message message = messageMapper.toEntity(messageDto);
        message.setCreatedAt(LocalDateTime.now());
        Message savedMessage = messageRepository.save(message);
        return messageMapper.toDto(savedMessage);
    }

    /**
     * retrieves all messages.
     * @return list of messages as DTOs
     */
    public List<MessageDto> getAllMessages() {
        return messageRepository.findAll()
                .stream()
                .map(messageMapper::toDto)
                .toList();
        }
    }


}
