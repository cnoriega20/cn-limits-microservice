package com.msvcs.cnlimitsmicroservice.controllers;

import com.msvcs.cnlimitsmicroservice.beans.LimitConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LimitsController {



    @GetMapping("/limits")
    public LimitConfiguration getLimitFromConfig(){
        return LimitConfiguration.builder()
                .maximum(1000)
                .minimum(1)
                .build();
    }
}
