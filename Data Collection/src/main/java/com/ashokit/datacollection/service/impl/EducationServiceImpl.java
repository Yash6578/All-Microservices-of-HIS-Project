package com.ashokit.datacollection.service.impl;

import com.ashokit.datacollection.bean.SaveResponse;
import com.ashokit.datacollection.entity.CitizenEducation;
import com.ashokit.datacollection.repository.CitizenEducationRepo;
import com.ashokit.datacollection.service.EducationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EducationServiceImpl implements EducationService {

    final CitizenEducationRepo educationRepo;

    @Override
    public SaveResponse save(CitizenEducation children) {
        Long educationId = educationRepo.save(children).getEducationID();

        if(educationId != 0)
            return new SaveResponse("Education details saved with id " + educationId, "Success");
        return new SaveResponse("Education details not saved", "Failed");
    }

    @Override
    public CitizenEducation getById(Long id) {
        return educationRepo.findById(id).orElse(null);
    }
}
