package com.ashokit.datacollection.service.impl;

import com.ashokit.datacollection.bean.Plan;
import com.ashokit.datacollection.client.PlanClient;
import com.ashokit.datacollection.service.PlanService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlanServiceImpl implements PlanService {
    final PlanClient client;

    @Override
    public List<Plan> getAllPlans() {
        return client.getAll().getBody();
    }
}
