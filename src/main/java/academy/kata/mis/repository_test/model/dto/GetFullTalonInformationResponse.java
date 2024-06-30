package academy.kata.mis.repository_test.model.dto;

import academy.kata.mis.repository_test.model.dto.department.DepartmentShortDto;
import academy.kata.mis.repository_test.model.dto.doctor.DoctorShortDto;
import academy.kata.mis.repository_test.model.dto.organization.OrganizationShortDto;
import academy.kata.mis.repository_test.model.dto.patient.PatientShortDto;

import java.time.LocalDate;

public record GetFullTalonInformationResponse(long talonId,
                                              LocalDate visitTime,
                                              OrganizationShortDto organization,
                                              DepartmentShortDto department,
                                              String cabinetNumber,
                                              DoctorShortDto doctor,
                                              PatientShortDto patient) {
}
