package ch.noahwie.kafkamessageappbackend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * Entity representing a Message.
 * A Message includes a title, content and a timestamp hen the message was created
 */
@Entity
@Table (name = "MESSAGE")
@Getter
@Setter
@ToString

public class Message {
    /** Unique Identifier of the message (Primary key)*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** Title of the Message */
    private String title;

    /** Content of the Message */
    @Column(columnDefinition = "TEXT")
    private String content;

    /** Timestamp when the message was created. */
    private LocalDateTime createdAt = LocalDateTime.now();

}
