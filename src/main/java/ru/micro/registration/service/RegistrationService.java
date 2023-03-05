package ru.micro.registration.service;

import ru.micro.registration.controller.dto.RegistrationDataDto;

/**
 * @author Tarkhov Evgeniy
 */
public interface RegistrationService {

    RegistrationDataDto addRegistrationData(RegistrationDataDto registrationDataDto);
}
