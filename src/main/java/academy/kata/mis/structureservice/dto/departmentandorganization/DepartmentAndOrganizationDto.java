package academy.kata.mis.structureservice.dto.departmentandorganization;

import lombok.Builder;

@Builder
public record DepartmentAndOrganizationDto(
        Long departmentId,
        String departmentName,
        Long organizationId,
        String organizationName) {
}
