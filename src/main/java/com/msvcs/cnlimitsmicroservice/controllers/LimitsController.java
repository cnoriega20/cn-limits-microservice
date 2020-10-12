package com.msvcs.cnlimitsmicroservice.controllers;

import com.msvcs.cnlimitsmicroservice.beans.LimitConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @GetMapping("/limits")
    public LimitConfiguration getLimitFromConfig(){
        return LimitConfiguration.builder()
                .maximum(1000)
                .minimum(1)
                .build();
    }
}
