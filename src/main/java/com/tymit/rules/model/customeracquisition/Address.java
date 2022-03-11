package com.tymit.rules.model.customeracquisition;

import lombok.*;

import java.time.Instant;

@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String street;
    private String flat;
    private String houseName;
    private String houseNumber;
    private String town;
    private String postcode;
    private Instant sinceDateOnAddress;
}
