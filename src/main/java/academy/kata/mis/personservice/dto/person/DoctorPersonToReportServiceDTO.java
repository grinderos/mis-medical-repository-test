package academy.kata.mis.personservice.dto.person;

import lombok.Builder;

@Builder
public record DoctorPersonToReportServiceDTO(Long personId,
                                             String firstName,
                                             String lastName,
                                             String patronymic) {
}
