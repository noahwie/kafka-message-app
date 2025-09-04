package ch.noahwie.kafkamessageappbackend.repository;

import ch.noahwie.kafkamessageappbackend.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

// provides CRUD operations for Message Entity
public interface MessageRepository extends JpaRepository<Message, Long> {
}
