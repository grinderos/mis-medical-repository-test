package academy.kata.mis.personservice.dto.person;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public record GetCurrentPatientInformation(long id,
                                           String firstName,
                                           String lastName,
                                           String patronymic,
                                           LocalDate birthday) {
}
