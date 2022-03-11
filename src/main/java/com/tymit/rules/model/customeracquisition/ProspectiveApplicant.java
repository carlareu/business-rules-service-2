package com.tymit.rules.model.customeracquisition;

import com.tymit.rules.model.ProductType;
import lombok.*;

import java.time.Instant;

@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProspectiveApplicant {
    private String firstName;
    private String lastName;
    private Instant dateOfBirth;
    private String productType;
    private Long grossAnnualIncomeBT;
    private Address currentAddress;
    private String eligibility;
}
