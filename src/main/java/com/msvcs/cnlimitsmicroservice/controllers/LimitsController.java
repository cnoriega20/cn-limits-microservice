package com.msvcs.cnlimitsmicroservice.controllers;

import com.msvcs.cnlimitsmicroservice.beans.LimitConfiguration;
import com.msvcs.cnlimitsmicroservice.configuration.Configuration;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LimitsController {

    private final Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration getLimitFromConfig(){
        return LimitConfiguration.builder()
                .maximum(configuration.getMaximum())
                .minimum(configuration.getMinimum())
                .build();
    }
    //TODO: Fix configuration
}
