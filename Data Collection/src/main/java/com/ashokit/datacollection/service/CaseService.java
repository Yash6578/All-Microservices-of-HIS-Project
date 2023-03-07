package com.ashokit.datacollection.service;

import com.ashokit.datacollection.bean.SaveResponse;
import com.ashokit.datacollection.entity.CitizenCase;

public interface CaseService {
    SaveResponse createCase(CitizenCase citizenCase);

    CitizenCase getById(Long id);
}
