package academy.kata.mis.medicalservice.model.dto.visit;

import academy.kata.mis.medicalservice.model.dto.service.MedicalServiceToReportDTO;
import lombok.Builder;

import java.time.LocalDateTime;
import java.util.List;

@Builder
public record VisitToReportDTO(Long id,
                               Long doctorId,
                               Long doctorPersonId,
                               Long doctorPositionId,
                               LocalDateTime visitTime,
                               List<MedicalServiceToReportDTO> medicalServiceToReportDTOs) {
}