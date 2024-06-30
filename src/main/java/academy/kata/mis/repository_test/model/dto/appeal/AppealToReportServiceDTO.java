package academy.kata.mis.repository_test.model.dto.appeal;

import academy.kata.mis.repository_test.model.enums.AppealStatus;
import academy.kata.mis.repository_test.model.enums.InsuranceType;
import lombok.Builder;

import java.time.LocalDate;
import java.util.List;
@Builder
public record AppealToReportServiceDTO(String diseaseName,
                                       AppealStatus appealStatus,
                                       InsuranceType insuranceType,
                                       long orderId,
                                       LocalDate openDate,
                                       long openDoctorId,
                                       List<Long> medicalServiceDepId,
                                       LocalDate closedDate,
                                       long closedDoctorId
                                             ) {
}


