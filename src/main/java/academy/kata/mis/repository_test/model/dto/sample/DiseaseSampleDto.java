package academy.kata.mis.repository_test.model.dto.sample;

import academy.kata.mis.repository_test.model.dto.service.MedicalServiceShortDto;

import java.util.List;


public record DiseaseSampleDto(List<MedicalServiceShortDto> medicalServices) {
}
