package academy.kata.mis.repository_test.model.dto;

import academy.kata.mis.repository_test.model.dto.sample.DiseaseSampleDto;

import java.util.List;

public record GetDiseaseSamplesWithServicesResponse(List<DiseaseSampleDto> samples) {
}
