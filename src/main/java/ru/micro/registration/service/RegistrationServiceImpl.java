package ru.micro.registration.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.micro.registration.controller.dto.RegistrationDataDto;
import ru.micro.registration.kafka.MessagePublicGateway;
import ru.micro.registration.mapper.RegistrationDataMapper;
import ru.micro.registration.model.RegistrationData;

/**
 * @author Tarkhov Evgeniy
 */
@Service
@RequiredArgsConstructor
public class RegistrationServiceImpl implements RegistrationService {
    private final ObjectMapper mapper;  //TODO do global config for mapper
    private final MessagePublicGateway messagePublicGateway;
    private final RegistrationDataMapper registrationDataMapper;

    @Override
    public RegistrationDataDto addRegistrationData(RegistrationDataDto registrationDataDto) {
        RegistrationData registrationData = registrationDataMapper.map(registrationDataDto);
        try {
            String msg = mapper.writeValueAsString(registrationData);
            System.out.println(msg);
            messagePublicGateway.send(msg);
            return registrationDataDto;
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
