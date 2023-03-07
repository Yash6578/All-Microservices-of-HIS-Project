package com.ashokit.datacollection.restcontroller;

import com.ashokit.datacollection.bean.SaveResponse;
import com.ashokit.datacollection.entity.CitizenEducation;
import com.ashokit.datacollection.service.EducationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/citizen/education")
public class EducationController {

    final EducationService educationService;

    @PostMapping("")
    ResponseEntity<SaveResponse> saveEducationDetails(@RequestBody CitizenEducation education) {
        SaveResponse saveResponse = educationService.save(education);

        if(saveResponse.getStatus().equals("Success"))
            return ResponseEntity.status(HttpStatus.CREATED).body(saveResponse);

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(saveResponse);
    }

    @GetMapping("/{id}")
    ResponseEntity<CitizenEducation> getEducationDetails(@PathVariable Long id) {
        return ResponseEntity.ok(educationService.getById(id));
    }

}
