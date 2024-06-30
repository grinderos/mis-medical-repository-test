package academy.kata.mis.repository_test.model.dto;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public record GetCurrentPatientInformation(long id,
                                           String firstName,
                                           String lastName,
                                           String patronymic,
                                           LocalDate birthday) {
}

