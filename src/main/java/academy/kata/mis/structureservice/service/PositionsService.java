package academy.kata.mis.structureservice.service;

import academy.kata.mis.structureservice.dto.department_organization_position_cabinet.DepartmentOrganizationPositionCabinetNameDto;
import academy.kata.mis.structureservice.dto.positions.RepPositionsDepartmentOrganizationDto;
import academy.kata.mis.structureservice.model.Position;

public interface PositionsService {
    Position getPositionNameAndCabinet(long id);

    RepPositionsDepartmentOrganizationDto getRepPositionsDepartmentOrganizationDto(long positionId);

    boolean isPositionExistsById(long id);

    DepartmentOrganizationPositionCabinetNameDto getDepartmentOrganizationPositionCabinetName(long positionId);
}
