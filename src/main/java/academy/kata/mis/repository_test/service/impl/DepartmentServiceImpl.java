package academy.kata.mis.repository_test.service.impl;

import academy.kata.mis.repository_test.repository.DepartmentRepository;
import academy.kata.mis.repository_test.service.DepartmentService;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public long getDepartmentIdByDoctorId(long id) {
        return departmentRepository.getDepartmentIdByDoctorId(id);
    }
}
