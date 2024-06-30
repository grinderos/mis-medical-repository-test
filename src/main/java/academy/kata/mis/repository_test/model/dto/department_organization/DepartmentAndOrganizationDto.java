package academy.kata.mis.repository_test.model.dto.department_organization;

import lombok.Builder;

@Builder
public record DepartmentAndOrganizationDto(
        Long departmentId,
        String departmentName,
        Long organizationId,
        String organizationName) {
}
