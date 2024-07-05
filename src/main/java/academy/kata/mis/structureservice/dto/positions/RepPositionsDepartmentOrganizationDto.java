package academy.kata.mis.structureservice.dto.positions;

import lombok.Builder;

@Builder
public record RepPositionsDepartmentOrganizationDto(
        Long positionId,
        String positionName,
        Long departmentId,
        String departmentName,
        Long organizationId,
        String organizationName) {

    public Long getPositionId() {
        return positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getOrganizationName() {
        return organizationName;
    }
}
