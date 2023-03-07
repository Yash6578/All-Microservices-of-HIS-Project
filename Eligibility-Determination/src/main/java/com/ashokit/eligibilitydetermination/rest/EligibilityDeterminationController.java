package com.ashokit.eligibilitydetermination.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EligibilityDeterminationController {

    @GetMapping("/test")
    void test() {
        System.out.println("test");
    }
}
