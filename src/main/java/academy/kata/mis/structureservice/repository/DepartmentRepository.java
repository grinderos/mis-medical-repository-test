package academy.kata.mis.structureservice.repository;

import academy.kata.mis.structureservice.dto.department.DepartmentDto;
import academy.kata.mis.structureservice.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    List<Department> getDepartmentsByOrganizationId(long organizationId);

    @Query("""
            SELECT d FROM Department d JOIN FETCH Organization o ON d.organization.id = o.id
            WHERE d.id=:departmentId
            """)
    Department getDepartmentAndOrganizationByDepartmentID(@Param("departmentId") Long departmentId);

    boolean existsDepartmentsById(Long departmentId);

    DepartmentDto getDepartmentNameById(long departmentId);
}
