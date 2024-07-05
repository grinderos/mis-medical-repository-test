package academy.kata.mis.structureservice.service.impl;

import academy.kata.mis.structureservice.dto.department.DepartmentDto;
import academy.kata.mis.structureservice.model.Department;
import academy.kata.mis.structureservice.repository.DepartmentRepository;
import academy.kata.mis.structureservice.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Override
    public List<Department> getDepartmentsByOrganizationId(long organizationId) {
        return departmentRepository.getDepartmentsByOrganizationId(organizationId);
    }

    @Override
    public Department getDepartmentAndOrganizationByDepartmentID(Long departmentId) {
        return departmentRepository.getDepartmentAndOrganizationByDepartmentID(departmentId);
    }

    @Override
    public boolean checkDepartmentById(Long departmentId) {
        return departmentRepository.existsDepartmentsById(departmentId);
    }


    @Override
    public DepartmentDto getDepartmentNameById(long departmentId) {
        return departmentRepository.getDepartmentNameById(departmentId);
    }
}
