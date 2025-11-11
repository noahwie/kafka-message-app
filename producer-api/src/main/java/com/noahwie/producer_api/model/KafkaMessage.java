package com.noahwie.producer_api.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class KafkaMessage {
    private String id;
    private String message;
}