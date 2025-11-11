package com.noahwie.producer_api.config;

import com.noahwie.producer_api.model.KafkaMessage;
import com.noahwie.producer_api.model.RestMessage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Configuration
public class KafkaConfig {
    @Bean
    public KafkaTemplate<String, KafkaMessage> kafkaTemplate() {
        Map<String, Object> config = new HashMap<>();
        config.put("bootstrap.servers", "localhost:9092");
        config.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        config.put("value.serializer", "org.springframework.kafka.support.serializer.JsonSerializer");

        DefaultKafkaProducerFactory<String, KafkaMessage> kafkaProducerFactory = new DefaultKafkaProducerFactory<>(config);
        return new KafkaTemplate<String, KafkaMessage>(kafkaProducerFactory);
    }
}
