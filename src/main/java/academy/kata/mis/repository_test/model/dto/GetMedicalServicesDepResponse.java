package academy.kata.mis.repository_test.model.dto;

import academy.kata.mis.repository_test.model.dto.service.MedicalServiceShortDto;

import java.util.List;

public record GetMedicalServicesDepResponse(List<MedicalServiceShortDto> medicalServices) {
}
