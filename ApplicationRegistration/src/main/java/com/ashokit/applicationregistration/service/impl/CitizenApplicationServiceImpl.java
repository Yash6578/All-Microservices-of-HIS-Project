package com.ashokit.applicationregistration.service.impl;

import com.ashokit.applicationregistration.bean.CitizenApplicationDto;
import com.ashokit.applicationregistration.bean.RegisterRequest;
import com.ashokit.applicationregistration.bean.RegisterResponse;
import com.ashokit.applicationregistration.entity.CitizenApplication;
import com.ashokit.applicationregistration.repository.CitizenApplicationRepo;
import com.ashokit.applicationregistration.service.CitizenApplicationService;
import com.ashokit.applicationregistration.service.SsnService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CitizenApplicationServiceImpl implements CitizenApplicationService {
    final SsnService ssnService;
    final CitizenApplicationRepo citizenApplicationRepo;

    @Override
    public RegisterResponse registerCitizen(RegisterRequest registerRequest) {
        CitizenApplication citizenApplication = new CitizenApplication();
        Long applicationId = 0L;

        String stateName = ssnService.getStateName(registerRequest.getSsn());
        if(stateName.equals("New Jersey")) {
            BeanUtils.copyProperties(registerRequest, citizenApplication);
            citizenApplication.setStateName(stateName);
            applicationId = citizenApplicationRepo.save(citizenApplication).getApplicationId();
        }

        if(applicationId != 0L)
            return new RegisterResponse("Citizen registered successfully with applicationId " + applicationId);

        return new RegisterResponse("Registration failed");
    }

    @Override
    public CitizenApplicationDto getApplication(Long appId) {
        CitizenApplication citizenApplication = citizenApplicationRepo.findById(appId).orElse(null);
        CitizenApplicationDto citizenApplicationDto = null;

        if(citizenApplication != null) {
            citizenApplicationDto = new CitizenApplicationDto();
            BeanUtils.copyProperties(citizenApplication, citizenApplicationDto);
        }

        return citizenApplicationDto;
    }
}
