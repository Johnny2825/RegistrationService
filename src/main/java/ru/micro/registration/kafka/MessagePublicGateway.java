package ru.micro.registration.kafka;

/**
 * @author Tarkhov Evgeniy
 */
public interface MessagePublicGateway {

    void send(String msg);

}
