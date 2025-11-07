package com.noahwie.consumer_worker.service;

import com.noahwie.consumer_worker.mapper.Mapper;
import com.noahwie.consumer_worker.model.KafkaMessage;
import com.noahwie.consumer_worker.model.Message;
import com.noahwie.consumer_worker.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    @Autowired
    private Mapper mapper;

    public void saveMessage(KafkaMessage KafkaMessage) {
        Message message = mapper.mapToMessage(KafkaMessage);
        messageRepository.save(message);
    }


}
