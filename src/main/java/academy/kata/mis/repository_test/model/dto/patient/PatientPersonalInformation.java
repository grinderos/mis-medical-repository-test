package academy.kata.mis.repository_test.model.dto.patient;

import academy.kata.mis.repository_test.model.dto.feign.OrganizationDto;
import lombok.Builder;

@Builder
public record PatientPersonalInformation(long patientId,
                                         OrganizationDto organization) {}
