package academy.kata.mis.structureservice.dto.positions;

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
