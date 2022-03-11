package com.tymit.rules.queries;

import com.tymit.rules.model.customeracquisition.Configuration;
import com.tymit.rules.model.customeracquisition.ProspectiveApplicant;
import lombok.*;
import org.kie.kogito.rules.RuleUnitData;

@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProspectiveApplicantUnit implements RuleUnitData {
    private Configuration configuration;
    private ProspectiveApplicant prospectiveApplicant;
}
