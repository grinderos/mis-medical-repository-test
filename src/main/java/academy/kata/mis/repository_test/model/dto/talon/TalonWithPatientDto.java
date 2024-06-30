package academy.kata.mis.repository_test.model.dto.talon;

import academy.kata.mis.repository_test.model.dto.patient.PatientShortDto;

import java.time.LocalDate;
import java.time.LocalTime;

public record TalonWithPatientDto(long talonId, LocalDate date, LocalTime time, PatientShortDto patient) {
}
