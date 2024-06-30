package academy.kata.mis.repository_test.model.dto.department;

import lombok.Builder;

@Builder
public record DepartmentShortDto(long departmentId,
                                 String departmentName) {
}
