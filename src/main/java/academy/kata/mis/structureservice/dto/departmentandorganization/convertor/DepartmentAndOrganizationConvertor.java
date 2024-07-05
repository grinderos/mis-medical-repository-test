package academy.kata.mis.structureservice.dto.departmentandorganization.convertor;

import academy.kata.mis.structureservice.dto.departmentandorganization.DepartmentAndOrganizationDto;
import academy.kata.mis.structureservice.model.Department;
import org.springframework.stereotype.Component;

@Component
public class DepartmentAndOrganizationConvertor {

    public DepartmentAndOrganizationDto entityToDepartmentAndOrganizationDto(Department entity) {
        return DepartmentAndOrganizationDto.builder()
                .departmentId(entity.getId())
                .departmentName(entity.getName())
                .organizationId(entity.getOrganization().getId())
                .organizationName(entity.getOrganization().getName())
                .build();
    }
}
