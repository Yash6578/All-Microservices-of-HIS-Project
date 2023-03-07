package com.ashokit.applicationregistration.service.impl;

import com.ashokit.applicationregistration.service.SsnService;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class SsnServiceImpl implements SsnService {
    @Override
    public String getStateName(Long ssn) {
        WebClient webClient = WebClient.create();

        return webClient
                .get()
                .uri("https://ssa-web-api.herokuapp.com/ssn/{ssn}", ssn)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
