package academy.kata.mis.personservice.dto.person;

import lombok.Builder;

import java.util.Set;

@Builder
public record PersonToReportServiceDTO(PatientPersonToReportServiceDTO patient,
                                       Set<DoctorPersonToReportServiceDTO> doctors) {
}
