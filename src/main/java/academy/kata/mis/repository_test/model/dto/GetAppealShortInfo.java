package academy.kata.mis.repository_test.model.dto;

import academy.kata.mis.repository_test.model.dto.disease.DiseaseShortInfoDto;
import academy.kata.mis.repository_test.model.dto.patient.PatientShortDto;
import academy.kata.mis.repository_test.model.dto.visit.VisitShortDto;
import academy.kata.mis.repository_test.model.enums.AppealStatus;
import lombok.Builder;

import java.util.List;

@Builder
public record GetAppealShortInfo(long appealId,
                                 AppealStatus appealStatus,
                                 PatientShortDto patient,
                                 DiseaseShortInfoDto disease,
                                 List<VisitShortDto> visits) {
}
