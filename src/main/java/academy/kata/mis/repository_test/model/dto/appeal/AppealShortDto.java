package academy.kata.mis.repository_test.model.dto.appeal;

import java.time.LocalDate;

public record AppealShortDto(long appealId,
                             LocalDate openDate,
                             LocalDate closedDate,
                             String diseaseName) {
}
