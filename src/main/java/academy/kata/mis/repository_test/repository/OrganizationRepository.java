package academy.kata.mis.repository_test.repository;

import academy.kata.mis.repository_test.model.entity.Department;
import academy.kata.mis.repository_test.model.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;


public interface OrganizationRepository extends JpaRepository<Organization, Long> {

    @Query("""
            SELECT t.organization.id
            FROM Department t
            WHERE t.id = :departmentId
            """)
    Long getOrganizationIdByDepartmentId(@Param("departmentId") Long departmentId);

    @Query("""
            SELECT t
            FROM Department t
            join fetch t.doctors
            WHERE t.organization.id = :organizationId
            """)
    Set<Department> findAllByOrganizationId(@Param("organizationId") Long organizationId);

    @Query("""
            SELECT d.department.organization.id FROM Doctor d WHERE d.id = :id
            """)
    long getOrganizationIdByDoctorId(long id);
}
