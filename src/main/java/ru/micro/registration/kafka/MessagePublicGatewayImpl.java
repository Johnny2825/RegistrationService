package ru.micro.registration.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @author Tarkhov Evgeniy
 */
@Component
@RequiredArgsConstructor
public class MessagePublicGatewayImpl implements MessagePublicGateway {
    private static final String TOPIC_NAME = "mail-command";
    private final KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void send(String msg) {
        kafkaTemplate.send(TOPIC_NAME, msg);    //TODO сделать типизированную отправку сообщения
    }
}
