package academy.kata.mis.repository_test.model.dto;

import academy.kata.mis.repository_test.model.dto.talon.TalonWithDoctorShortDto;

import java.util.List;

public record GetAssignedTalonsByPatientResponse(List<TalonWithDoctorShortDto> talons) {
}
