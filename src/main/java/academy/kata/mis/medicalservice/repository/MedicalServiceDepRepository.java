package academy.kata.mis.medicalservice.repository;

import academy.kata.mis.medicalservice.model.entity.MedicalServiceDep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MedicalServiceDepRepository extends JpaRepository<MedicalServiceDep, Long> {

    @Query("""
            SELECT msd
            FROM MedicalServiceDep msd
            JOIN FETCH msd.visits vis
            WHERE vis.id IN :visitIds
            """)
    List<MedicalServiceDep> getMedicalServiceDepByVisitIds(List<Long> visitIds);
}