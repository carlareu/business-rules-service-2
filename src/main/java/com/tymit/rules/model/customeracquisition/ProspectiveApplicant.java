package com.tymit.rules.model.customeracquisition;

import com.tymit.rules.utils.DateUtils;
import lombok.*;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProspectiveApplicant {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String productType;
    private Long grossAnnualIncomeBT;
    private Address currentAddress;
    public String eligibility;

    public Integer getAge() throws ParseException {
        LocalDate startLocal = DateUtils.convertToLocalDateViaInstant(DateUtils.formatToDate(dateOfBirth));
        LocalDate endLocal = DateUtils.convertToLocalDateViaInstant(new Date());
        return Period.between(startLocal, endLocal).getYears();
    }
}
