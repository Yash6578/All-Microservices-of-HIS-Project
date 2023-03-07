package com.ashokit.datacollection.client;

import com.ashokit.datacollection.bean.Application;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ApplicationRegistration", url = "http://localhost:8082")
public interface ApplicationClient {
    @GetMapping("/application/{applicationId}")
    ResponseEntity<Application> getApplication(@PathVariable Long applicationId);
}
