package com.ashokit.datacollection.service;

import com.ashokit.datacollection.bean.SaveResponse;
import com.ashokit.datacollection.entity.CitizenEducation;

public interface EducationService {
    SaveResponse save(CitizenEducation children);
    CitizenEducation getById(Long id);
}
