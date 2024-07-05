package academy.kata.mis.structureservice.dto.department.convertor;

import academy.kata.mis.structureservice.dto.department.DepartmentDto;
import academy.kata.mis.structureservice.model.Department;
import org.springframework.stereotype.Component;
@Component
public class DepartmentConvertor {
    public DepartmentDto entityToDepartmentDto(Department entity) {
        return DepartmentDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();
    }
}