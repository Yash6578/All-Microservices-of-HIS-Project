package com.ashokit.datacollection.client;

import com.ashokit.datacollection.bean.Plan;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "PlanClient", url = "http://localhost:8083")
public interface PlanClient {
    @GetMapping("plan/all")
    ResponseEntity<List<Plan>> getAll();
}
