package academy.kata.mis.repository_test.model.dto;

import academy.kata.mis.repository_test.model.dto.feign.PersonDto;
import academy.kata.mis.repository_test.model.dto.patient.PatientPersonalInformation;
import lombok.Builder;

import java.util.List;
import java.util.UUID;

@Builder
public record GetCurrentPatientPersonalInfoResponse(UUID userId,
                                                    PersonDto person,
                                                    List<PatientPersonalInformation> patients) {
}
