package ch.noahwie.kafkamessageappbackend.mapper;

import ch.noahwie.kafkamessageappbackend.dto.MessageDto;
import ch.noahwie.kafkamessageappbackend.model.Message;
import org.mapstruct.Mapper;

/**
 * MapStruct mapper interface for converting between Message entities and MessageDto objects.
 * Used to seperate internal entity structure from external data transfer structure
 */
@Mapper(componentModel = "spring")
public interface MessageMapper {
    /**
     * Converts a Message entity to a MessageDto.
     * @param message
     * @return corresponding MessageDto
     */
    MessageDto toDto(Message message);

    /**
     * Converts a MessageDto into a Message entity.
     * @param messageDto
     * @return corresponding Message Entity
     */
    Message toEntity(MessageDto messageDto);
}
