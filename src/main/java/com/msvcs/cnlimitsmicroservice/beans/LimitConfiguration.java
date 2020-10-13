package com.msvcs.cnlimitsmicroservice.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class LimitConfiguration {
    private Integer minimum;
    private Integer maximum;
}
