package com.ashokit.datacollection.restcontroller;

import com.ashokit.datacollection.bean.Plan;
import com.ashokit.datacollection.service.PlanService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/plan")
public class PlanController {
    final PlanService planService;

    @GetMapping("/all")
    ResponseEntity<List<Plan>> getAllPlans() {
        List<Plan> allPlans = planService.getAllPlans();
        return ResponseEntity.ok(allPlans);
    }
}
