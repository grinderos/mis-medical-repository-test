package academy.kata.mis.repository_test.repository;

import academy.kata.mis.repository_test.model.entity.MedicalService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface MedicalServiceRepository extends JpaRepository<MedicalService, Long> {

    @Query("""
            SELECT ms
            FROM MedicalService ms
               JOIN FETCH ms.servicesDep sd
            WHERE sd.id IN :servicesDepId
            """)
    Set<MedicalService> getMedicalServiceByServicesDepId(Set<Long> servicesDepId);
}
