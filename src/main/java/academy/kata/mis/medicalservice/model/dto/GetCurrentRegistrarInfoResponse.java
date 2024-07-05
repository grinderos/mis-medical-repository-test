package academy.kata.mis.medicalservice.model.dto;

import academy.kata.mis.medicalservice.model.dto.feign.PersonDto;
import academy.kata.mis.medicalservice.model.dto.employee.EmployeeShortInfoInOrganizationDto;

import java.util.List;

public record GetCurrentRegistrarInfoResponse(PersonDto person,
                                              List<EmployeeShortInfoInOrganizationDto> registrars) {
}
