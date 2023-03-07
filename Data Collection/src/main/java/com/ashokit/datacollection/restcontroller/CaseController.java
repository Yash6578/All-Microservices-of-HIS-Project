package com.ashokit.datacollection.restcontroller;

import com.ashokit.datacollection.bean.SaveResponse;
import com.ashokit.datacollection.entity.CitizenCase;
import com.ashokit.datacollection.service.CaseService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("citizen/case")
public class CaseController {

    final CaseService caseService;

    @PostMapping("")
    ResponseEntity<SaveResponse> createCase(@RequestBody CitizenCase citizenCase) {
        var saveResponse = caseService.createCase(citizenCase);

        if(saveResponse.getStatus().equals("Success"))
            return ResponseEntity.status(HttpStatus.CREATED).body(saveResponse);

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(saveResponse);
    }
}
