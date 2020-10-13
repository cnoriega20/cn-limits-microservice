package com.msvcs.cnlimitsmicroservice.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("cn-limits-service")
@Data
public class Configuration {
    private Integer minimum;
    private Integer maximum;


}
