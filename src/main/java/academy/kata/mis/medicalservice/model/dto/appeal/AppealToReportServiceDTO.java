package academy.kata.mis.medicalservice.model.dto.appeal;

import academy.kata.mis.medicalservice.model.dto.disease.DiseaseToReportDTO;
import academy.kata.mis.medicalservice.model.dto.visit.VisitToReportDTO;
import academy.kata.mis.medicalservice.model.enums.InsuranceType;
import academy.kata.mis.medicalservice.model.enums.AppealStatus;
import lombok.Builder;

import java.time.LocalDate;
import java.util.List;

@Builder
public record AppealToReportServiceDTO(Long appealId,
                                       AppealStatus appealStatus,
                                       InsuranceType insuranceType,
                                       LocalDate openDate,
                                       LocalDate closedDate,
                                       DiseaseToReportDTO disease,
                                       Long patientPersonId,
                                       List<VisitToReportDTO> visits) {
}