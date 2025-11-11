package com.noahwie.consumer_worker.service;

import com.noahwie.consumer_worker.mapper.Mapper;
import com.noahwie.consumer_worker.model.KafkaMessage;
import com.noahwie.consumer_worker.model.Message;
import com.noahwie.consumer_worker.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    private final MessageRepository messageRepository;

    private final Mapper mapper;

    public MessageService(MessageRepository messageRepository, Mapper mapper) {
        this.messageRepository = messageRepository;
        this.mapper = mapper;
    }

    public void saveMessage(KafkaMessage kafkaMessage) {
        Message message = mapper.mapToMessage(kafkaMessage);
        messageRepository.save(message);
    }


}
