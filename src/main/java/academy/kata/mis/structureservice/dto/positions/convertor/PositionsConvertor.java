package academy.kata.mis.structureservice.dto.positions.convertor;

import academy.kata.mis.structureservice.dto.positions.PositionNameAndCabinetDto;
import academy.kata.mis.structureservice.dto.positions.RepPositionsDepartmentOrganizationDto;
import academy.kata.mis.structureservice.model.Position;
import org.springframework.stereotype.Component;

@Component
public class PositionsConvertor {

    public PositionNameAndCabinetDto getPositionNameAndCabinetDto(Position entity) {
        return PositionNameAndCabinetDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .cabinet(entity.getCabinet().getValue())
                .build();
    }

    public RepPositionsDepartmentOrganizationDto entityToRepPositionsDepartmentOrganizationDto(RepPositionsDepartmentOrganizationDto repPositionsDepartmentOrganizationDto) {

        return RepPositionsDepartmentOrganizationDto.builder()
                .positionId(repPositionsDepartmentOrganizationDto.getPositionId())
                .positionName(repPositionsDepartmentOrganizationDto.getPositionName())
                .departmentId(repPositionsDepartmentOrganizationDto.getDepartmentId())
                .departmentName(repPositionsDepartmentOrganizationDto.getDepartmentName())
                .organizationId(repPositionsDepartmentOrganizationDto.getOrganizationId())
                .organizationName(repPositionsDepartmentOrganizationDto.getOrganizationName())
                .build();
    }
}

