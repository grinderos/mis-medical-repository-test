package academy.kata.mis.repository_test.model.dto.talon;

import java.time.LocalDate;
import java.util.List;

public record DoctorTalonsOnDayDto(LocalDate day,
                                   List<TalonShortDto> talons) {
}
