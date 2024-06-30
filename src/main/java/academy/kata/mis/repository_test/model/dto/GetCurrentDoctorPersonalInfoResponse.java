package academy.kata.mis.repository_test.model.dto;

import academy.kata.mis.repository_test.model.dto.department.DepartmentShortDto;
import academy.kata.mis.repository_test.model.dto.doctor.DoctorShortDto;
import academy.kata.mis.repository_test.model.dto.organization.OrganizationShortDto;
import lombok.Builder;

@Builder
public record GetCurrentDoctorPersonalInfoResponse(DoctorShortDto doctor,
                                                   OrganizationShortDto organization,
                                                   DepartmentShortDto department,
                                                   String cabinetNumber) {
}
