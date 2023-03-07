package com.ashokit.eligibilitydetermination.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testCtrler {
    @GetMapping("/test2")
    void test2() {
        System.out.println("Test2");
    }
}
