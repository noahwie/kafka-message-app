package com.noahwie.consumer_worker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "message")
@Getter
@Setter
public class Message {
    @Id
    String messageId;
    String message;
}
