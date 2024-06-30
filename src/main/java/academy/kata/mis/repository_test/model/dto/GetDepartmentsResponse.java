package academy.kata.mis.repository_test.model.dto;

import academy.kata.mis.repository_test.model.dto.department.DepartmentShortDto;

import java.util.List;

public record GetDepartmentsResponse(List<DepartmentShortDto> departments) {
}
