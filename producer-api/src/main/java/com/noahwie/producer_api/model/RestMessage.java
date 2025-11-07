package com.noahwie.producer_api.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RestMessage {
    private String messageId;
    private String message;
}

/*
    "messageId": "automated id"
    "message": "i am a message"
 */
