package ru.micro.registration.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author Tarkhov Evgeniy
 */
@Data
@Builder
public class RegistrationData {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
}
