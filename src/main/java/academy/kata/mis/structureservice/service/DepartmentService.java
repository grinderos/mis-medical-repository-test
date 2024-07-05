package academy.kata.mis.structureservice.service;

import academy.kata.mis.structureservice.dto.department.DepartmentDto;
import academy.kata.mis.structureservice.model.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getDepartmentsByOrganizationId(long organizationId);

    Department getDepartmentAndOrganizationByDepartmentID(Long departmentId);

    boolean checkDepartmentById(Long departmentId);

    DepartmentDto getDepartmentNameById(long departmentId);
}
