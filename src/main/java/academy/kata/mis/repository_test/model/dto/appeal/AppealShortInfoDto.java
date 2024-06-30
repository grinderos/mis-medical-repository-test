package academy.kata.mis.repository_test.model.dto.appeal;

import java.time.LocalDate;

public record AppealShortInfoDto(long appealId,
                                 String diseaseName,
                                 String diseaseCode,
                                 LocalDate firstVisit) {
}
