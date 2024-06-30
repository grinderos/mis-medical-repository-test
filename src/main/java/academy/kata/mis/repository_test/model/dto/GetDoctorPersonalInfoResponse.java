package academy.kata.mis.repository_test.model.dto;

import academy.kata.mis.repository_test.model.dto.employee.EmployeeShortInfoInOrganizationDto;
import academy.kata.mis.repository_test.model.dto.feign.PersonDto;
import lombok.Builder;

import java.util.List;

@Builder


public record GetDoctorPersonalInfoResponse(PersonDto person,
                                            List<EmployeeShortInfoInOrganizationDto> doctors) {
}
