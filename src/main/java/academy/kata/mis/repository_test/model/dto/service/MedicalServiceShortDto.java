package academy.kata.mis.repository_test.model.dto.service;

import lombok.Builder;

@Builder
public record MedicalServiceShortDto(long medicalServiceDepId,
                                     String serviceIdentifier,
                                     String serviceName) {
}
