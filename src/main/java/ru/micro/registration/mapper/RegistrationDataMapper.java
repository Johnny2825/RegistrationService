package ru.micro.registration.mapper;

import ru.micro.registration.controller.dto.RegistrationDataDto;
import ru.micro.registration.model.RegistrationData;

/**
 * @author Tarkhov Evgeniy
 */
public interface RegistrationDataMapper {

    RegistrationData map(RegistrationDataDto registrationDataDto);

    RegistrationDataDto map(RegistrationData registrationData);
}
