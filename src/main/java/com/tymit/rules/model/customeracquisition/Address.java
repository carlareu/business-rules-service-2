package com.tymit.rules.model.customeracquisition;

import lombok.*;

import java.util.List;

@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    public static final List<String> EXCLUDED_POSTCODE_ROOTS = List.of("JE", "GY", "IM");

    private String street;
    private String flat;
    private String houseName;
    private String houseNumber;
    private String town;
    private String postcode;
    private String sinceDateOnAddress;

    public String getPostcodePrefix() {
        return postcode.substring(0, 2);
    }
}
