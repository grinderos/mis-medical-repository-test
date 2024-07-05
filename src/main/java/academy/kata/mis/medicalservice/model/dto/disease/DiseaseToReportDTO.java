package academy.kata.mis.medicalservice.model.dto.disease;

import lombok.Builder;

@Builder
public record DiseaseToReportDTO(Long id, String name) {
}
