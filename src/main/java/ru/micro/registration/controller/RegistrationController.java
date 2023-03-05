package ru.micro.registration.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.micro.registration.controller.dto.RegistrationDataDto;
import ru.micro.registration.service.RegistrationService;

import javax.validation.Valid;

/**
 * @author Tarkhov Evgeniy
 */
@RestController
@RequiredArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;

    @PostMapping("/create")
    public ResponseEntity<RegistrationDataDto> addRegistrationData(@Valid @RequestBody RegistrationDataDto registrationDataDto) {

        return ResponseEntity.ok(registrationService.addRegistrationData(registrationDataDto));
    }

}
