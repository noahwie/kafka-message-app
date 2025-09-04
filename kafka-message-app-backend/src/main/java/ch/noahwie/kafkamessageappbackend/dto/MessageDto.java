package ch.noahwie.kafkamessageappbackend.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Data Transfer Object (Dto) representing a message.
 * Used to transfer message between UI and API.
 */
@Getter
@Setter
public class MessageDto {
    /** Title of the message. Must not be blank */
    @NotBlank (message = "The message titel can not be left empty")
    private String title;

    /** Content of the message. Must not be blank */
    @NotBlank (message = "The message content can not be left empty")
    private String content;

    /** Timestamp when the note was created */
    private LocalDateTime dateTime;
}
