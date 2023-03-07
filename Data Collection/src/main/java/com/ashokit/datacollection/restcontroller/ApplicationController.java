package com.ashokit.datacollection.restcontroller;

import com.ashokit.datacollection.service.ApplicationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/application")
public class ApplicationController {
    final ApplicationService applicationService;

    @GetMapping("/verify/{applicationId}")
    ResponseEntity<Void> isApplicationValid(@PathVariable Long applicationId) {
        boolean applicationValid = applicationService.isApplicationValid(applicationId);

        if(applicationValid)
            return ResponseEntity.status(HttpStatus.OK).build();

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
