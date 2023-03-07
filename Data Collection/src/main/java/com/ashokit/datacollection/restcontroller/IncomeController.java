package com.ashokit.datacollection.restcontroller;

import com.ashokit.datacollection.bean.SaveResponse;
import com.ashokit.datacollection.entity.CitizenIncome;
import com.ashokit.datacollection.service.IncomeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("citizen/income")
public class IncomeController {
    final IncomeService incomeService;

    @PostMapping("")
    ResponseEntity<SaveResponse> save(@RequestBody CitizenIncome income) {
        SaveResponse saveResponse = incomeService.save(income);

        if(saveResponse.getStatus().equals("Success"))
            return ResponseEntity.status(HttpStatus.CREATED).body(saveResponse);

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(saveResponse);
    }

    @GetMapping("/{id}")
    ResponseEntity<CitizenIncome> getEducationDetails(@PathVariable Long id) {
        return ResponseEntity.ok(incomeService.getById(id));
    }
}
