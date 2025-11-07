package com.noahwie.consumer_worker.repository;

import com.noahwie.consumer_worker.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, String> {
}
