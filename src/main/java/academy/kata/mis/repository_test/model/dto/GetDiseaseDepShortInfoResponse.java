package academy.kata.mis.repository_test.model.dto;

import academy.kata.mis.repository_test.model.dto.disease.DiseaseShortInfoDto;

import java.util.List;

public record GetDiseaseDepShortInfoResponse(List<DiseaseShortInfoDto> diseases) {
}
