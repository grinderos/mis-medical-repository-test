package academy.kata.mis.repository_test.model.dto.doctor;

import academy.kata.mis.repository_test.model.dto.talon.TalonShortDto;

import java.util.List;

public record DoctorWithTalonsDto(DoctorShortDto doctor,
                                  List<TalonShortDto> talons) {
}
