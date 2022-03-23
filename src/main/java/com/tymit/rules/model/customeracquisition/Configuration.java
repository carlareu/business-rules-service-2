package com.tymit.rules.model.customeracquisition;

import lombok.*;

@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Configuration {
    private String eligibilityDefault;
    private String notRatedValue;
    private Integer throttlePct;
    private Integer minimumIncome;
    private String notQualifiedValue;
    private String integrator;
    private String product;
    private Integer minimumAge;
}
