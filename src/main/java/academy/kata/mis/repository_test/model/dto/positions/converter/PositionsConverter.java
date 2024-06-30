package academy.kata.mis.repository_test.model.dto.positions.converter;

import academy.kata.mis.repository_test.model.dto.positions.PositionsDepartmentOrganizationDto;
import academy.kata.mis.repository_test.model.dto.positions.RepPositionsDepartmentOrganizationDto;
import org.springframework.stereotype.Component;

@Component
public class PositionsConverter {


    public PositionsDepartmentOrganizationDto entityToPositionsDepartmentOrganizationDto(Long positionId, String positionName,
                                                                                         Long departmentId, String departmentName,
                                                                                         Long organizationId, String organizationName) {

        return PositionsDepartmentOrganizationDto.builder()
                .positionId(positionId)
                .positionName(positionName)
                .departmentId(departmentId)
                .departmentName(departmentName)
                .organizationId(organizationId)
                .organizationName(organizationName)
                .build();
    }

    public RepPositionsDepartmentOrganizationDto entityToRepPositionsDepartmentOrganizationDto(Long positionId, String positionName,
                                                                                               Long departmentId, String departmentName,
                                                                                               Long organizationId, String organizationName) {

        return RepPositionsDepartmentOrganizationDto.builder()
                .positionId(positionId)
                .positionName(positionName)
                .departmentId(departmentId)
                .departmentName(departmentName)
                .organizationId(organizationId)
                .organizationName(organizationName)
                .build();
    }

}
