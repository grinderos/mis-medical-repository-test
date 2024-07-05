package academy.kata.mis.structureservice.dto;

import academy.kata.mis.structureservice.dto.department.DepartmentDto;
import lombok.Builder;

import java.util.List;
@Builder
public record GetCurrentPatientOrganizationDepartments(List<DepartmentDto> departments) {
}
