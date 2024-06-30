package academy.kata.mis.repository_test.model.dto.visit;

import academy.kata.mis.repository_test.model.dto.doctor.DoctorShortDto;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record VisitShortDto(long visitId,
                            LocalDateTime visitTime,
                            DoctorShortDto doctor) {
}
