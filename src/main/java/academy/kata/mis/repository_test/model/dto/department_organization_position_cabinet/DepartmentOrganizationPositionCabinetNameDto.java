package academy.kata.mis.repository_test.model.dto.department_organization_position_cabinet;

import lombok.Builder;

@Builder
public record DepartmentOrganizationPositionCabinetNameDto(long departmentId,
                                                           String departmentName,
                                                           long organizationId,
                                                           String organizationName,
                                                           String positionName,
                                                           String cabinetNumber) {
}
