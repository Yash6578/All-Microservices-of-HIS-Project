package com.ashokit.datacollection.service.impl;

import com.ashokit.datacollection.bean.SaveResponse;
import com.ashokit.datacollection.entity.CitizenCase;
import com.ashokit.datacollection.repository.CitizenCaseRepo;
import com.ashokit.datacollection.service.CaseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CaseServiceImpl implements CaseService {
    final CitizenCaseRepo caseRepo;

    @Override
    public SaveResponse createCase(CitizenCase citizenCase) {
        Long caseId = caseRepo.save(citizenCase).getCaseId();

        if(caseId != 0)
            return new SaveResponse("Case created successfully " + caseId, "Success");

        return new SaveResponse("case not created", "Failed");
    }

    @Override
    public CitizenCase getById(Long id) {
        return caseRepo.findById(id).orElse(null);
    }

}
