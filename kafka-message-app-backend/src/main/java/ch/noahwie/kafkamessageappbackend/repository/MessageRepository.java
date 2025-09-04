package ch.noahwie.kafkamessageappbackend.repository;

import ch.noahwie.kafkamessageappbackend.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
