package com.ashokit.datacollection.restcontroller;

import com.ashokit.datacollection.bean.SaveResponse;
import com.ashokit.datacollection.entity.CitizenChildren;
import com.ashokit.datacollection.service.ChildrenService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/citizen/children")
@AllArgsConstructor
public class ChildrenController {

    final ChildrenService childrenService;

    @PostMapping("")
    ResponseEntity<SaveResponse> saveChildrenDetails(@RequestBody CitizenChildren children) {
        var saveResponse = childrenService.save(children);

        if(saveResponse.getStatus().equals("Success"))
            return ResponseEntity.status(HttpStatus.CREATED).body(saveResponse);

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(saveResponse);
    }

    @GetMapping("/{id}")
    ResponseEntity<CitizenChildren> getById(@PathVariable Long id) {
        return ResponseEntity.ok(childrenService.getById(id));
    }
}
