package academy.kata.mis.repository_test.model.dto;

import academy.kata.mis.repository_test.model.dto.employee.EmployeeShortInfoInOrganizationDto;
import academy.kata.mis.repository_test.model.dto.feign.PersonDto;

import java.util.List;

public record GetRegistrarPersonalInfoResponse(PersonDto person,
                                               List<EmployeeShortInfoInOrganizationDto> registrar) {
}
