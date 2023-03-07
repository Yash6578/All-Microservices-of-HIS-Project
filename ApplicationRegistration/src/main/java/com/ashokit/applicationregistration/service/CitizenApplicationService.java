package com.ashokit.applicationregistration.service;

import com.ashokit.applicationregistration.bean.CitizenApplicationDto;
import com.ashokit.applicationregistration.bean.RegisterRequest;
import com.ashokit.applicationregistration.bean.RegisterResponse;

public interface CitizenApplicationService {
    RegisterResponse registerCitizen(RegisterRequest registerRequest);
    CitizenApplicationDto getApplication(Long appId);
}
