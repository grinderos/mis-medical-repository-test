package academy.kata.mis.personservice.dto.person;

import lombok.Builder;

@Builder
public record PersonToReportServiceDTO(PatientPersonToReportServiceDTO patient,
                                       DoctorPersonToReportServiceDTO doctor) {
}
