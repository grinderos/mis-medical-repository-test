package academy.kata.mis.personservice.dto.person;

import lombok.Builder;

@Builder
public record DoctorShortDto(long doctorId,
                             String doctorFirstName,
                             String doctorLastName,
                             String patronymic,
                             String doctorPositionName) {
}
