package academy.kata.mis.repository_test.model.dto;

import academy.kata.mis.repository_test.model.dto.talon.TalonWithPatientDto;

import java.time.LocalDate;
import java.util.List;

public record GetDoctorCurrentDayTalonsResponse(LocalDate today, List<TalonWithPatientDto> talons) {
}
