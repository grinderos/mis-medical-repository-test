package academy.kata.mis.repository_test.model.dto.disease;

import lombok.Builder;

@Builder
public record DiseaseShortInfoDto(long diseaseDepId,
                                  String diseaseName,
                                  String diseaseIdentifier) {
}
