package com.ashokit.datacollection.service.impl;

import com.ashokit.datacollection.bean.SaveResponse;
import com.ashokit.datacollection.entity.CitizenChildren;
import com.ashokit.datacollection.repository.CitizenChildrenRepo;
import com.ashokit.datacollection.service.ChildrenService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ChildrenServiceImpl implements ChildrenService {
    final CitizenChildrenRepo childrenRepo;
    @Override
    public SaveResponse save(CitizenChildren children) {
        Long parentId = childrenRepo.save(children).getParentId();

        if(parentId != 0)
            return new SaveResponse("Children details saved with parentId " + parentId, "Success");

        return new SaveResponse("Children details not saved", "Failed");
    }

    @Override
    public CitizenChildren getById(Long id) {
        return childrenRepo.findById(id).orElse(null);
    }
}
