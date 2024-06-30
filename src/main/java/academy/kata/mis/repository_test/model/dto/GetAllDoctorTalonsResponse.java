package academy.kata.mis.repository_test.model.dto;

import academy.kata.mis.repository_test.model.dto.talon.DoctorTalonsOnDayDto;

import java.util.List;

public record GetAllDoctorTalonsResponse(List<DoctorTalonsOnDayDto> days) {
}
