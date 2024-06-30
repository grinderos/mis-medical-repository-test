package academy.kata.mis.repository_test.service;

public interface OrganizationService {

    Long getOrganizationIdByDepartmentId(Long departmentId);

    long getOrganizationIdByDoctorId(long id);
}
