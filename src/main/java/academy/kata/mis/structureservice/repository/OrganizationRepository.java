package academy.kata.mis.structureservice.repository;

import academy.kata.mis.structureservice.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long> {

    @Query("""
            select case when count(o.id) > 0 then true else false end
            from Organization o
            where o.id = :organizationId
            """)
    boolean isExistById(long organizationId);


}