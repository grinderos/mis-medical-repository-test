package academy.kata.mis.repository_test.model.dto.department;

import academy.kata.mis.repository_test.model.dto.talon.TalonWithDoctorShortDto;

import java.util.List;

public record DepartmentWithTalonsDto(long departmentId,
                                      String departmentName,
                                      List<TalonWithDoctorShortDto> talons) {
}
