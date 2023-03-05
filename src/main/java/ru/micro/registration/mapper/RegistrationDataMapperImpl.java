package ru.micro.registration.mapper;

import org.springframework.stereotype.Component;
import ru.micro.registration.controller.dto.RegistrationDataDto;
import ru.micro.registration.model.RegistrationData;

import static java.util.Objects.isNull;

/**
 * @author Tarkhov Evgeniy
 */
@Component
public class RegistrationDataMapperImpl implements RegistrationDataMapper {
    
    @Override
    public RegistrationData map(RegistrationDataDto registrationDataDto) {
        if (isNull(registrationDataDto)) {
            return null;
        }
        return RegistrationData.builder()
                .firstName(registrationDataDto.getFirstName())
                .lastName(registrationDataDto.getLastName())
                .email(registrationDataDto.getEmail())
                .phoneNumber(registrationDataDto.getPhoneNumber())
                .build();
    }

    @Override
    public RegistrationDataDto map(RegistrationData registrationData) {
        if (isNull(registrationData)) {
            return null;
        }
        return RegistrationDataDto.builder()
                .firstName(registrationData.getFirstName())
                .lastName(registrationData.getLastName())
                .email(registrationData.getEmail())
                .phoneNumber(registrationData.getPhoneNumber())
                .build();
    }
}
