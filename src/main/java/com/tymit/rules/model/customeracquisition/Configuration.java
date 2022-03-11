package com.tymit.rules.model.customeracquisition;

import com.tymit.rules.model.ProductType;
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
    private ProductType product;
    private Integer minimumAge;
}
