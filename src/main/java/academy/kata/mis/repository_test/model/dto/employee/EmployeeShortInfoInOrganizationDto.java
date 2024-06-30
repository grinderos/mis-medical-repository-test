package academy.kata.mis.repository_test.model.dto.employee;

import academy.kata.mis.repository_test.model.dto.department.DepartmentShortDto;
import academy.kata.mis.repository_test.model.dto.organization.OrganizationShortDto;
import lombok.Builder;



@Builder
public record EmployeeShortInfoInOrganizationDto(long employeeId,
                                                 String positionName,
                                                 OrganizationShortDto organization,
                                                 DepartmentShortDto department) {
}
