package com.ashokit.applicationregistration.restcontroller;

import com.ashokit.applicationregistration.bean.CitizenApplicationDto;
import com.ashokit.applicationregistration.bean.RegisterRequest;
import com.ashokit.applicationregistration.bean.RegisterResponse;
import com.ashokit.applicationregistration.service.CitizenApplicationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class CitizenApplicationController {

    final CitizenApplicationService citizenApplicationService;

    @PostMapping("/register")
    ResponseEntity<RegisterResponse> register(@RequestBody RegisterRequest registerRequest) {
        RegisterResponse response = citizenApplicationService.registerCitizen(registerRequest);

        return ResponseEntity.ok(response);
    }

    @GetMapping("application/{applicationId}")
    ResponseEntity<CitizenApplicationDto> getApplication(@PathVariable Long applicationId) {
        var citizenApplicationDto = citizenApplicationService.getApplication(applicationId);
        return ResponseEntity.ok(citizenApplicationDto);
    }
}
