package ru.micro.registration.controller.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * @author Tarkhov Evgeniy
 */
@Data
@Builder
public class RegistrationDataDto {
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @Email
    private String email;
    @Pattern(regexp = "\\+?\\d{11}")
    private String phoneNumber;
}
