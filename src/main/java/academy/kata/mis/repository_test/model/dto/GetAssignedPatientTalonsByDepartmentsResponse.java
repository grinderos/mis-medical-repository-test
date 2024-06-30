package academy.kata.mis.repository_test.model.dto;

import academy.kata.mis.repository_test.model.dto.department.DepartmentWithTalonsDto;

import java.util.List;

public record GetAssignedPatientTalonsByDepartmentsResponse(List<DepartmentWithTalonsDto> departments) {
}
