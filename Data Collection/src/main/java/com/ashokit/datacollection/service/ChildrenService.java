package com.ashokit.datacollection.service;

import com.ashokit.datacollection.bean.SaveResponse;
import com.ashokit.datacollection.entity.CitizenChildren;

public interface ChildrenService {
    SaveResponse save(CitizenChildren children);
    CitizenChildren getById(Long id);
}
