package academy.kata.mis.repository_test.model.dto.feign;

import lombok.Builder;

@Builder
public record PositionsDepartmentOrganizationDto(
        Long positionId,
        String positionName,
        Long departmentId,
        String departmentName,
        Long organizationId,
        String organizationName) {

}
