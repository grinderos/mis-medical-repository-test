package academy.kata.mis.repository_test.model.dto;

import academy.kata.mis.repository_test.model.dto.doctor.DoctorShortDto;

import java.util.List;

public record GetDoctorsForDepartmentResponse(long departmentId,
                                              String departmentName,
                                              List<DoctorShortDto> doctors) {
}
