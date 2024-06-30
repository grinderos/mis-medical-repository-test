package academy.kata.mis.repository_test.repository;

import academy.kata.mis.repository_test.model.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    @Query("""
            SELECT d.department.id FROM Doctor d WHERE d.id = :id
            """)
    long getDepartmentIdByDoctorId(long id);
}
