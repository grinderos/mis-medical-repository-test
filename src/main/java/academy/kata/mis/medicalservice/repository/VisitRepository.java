package academy.kata.mis.medicalservice.repository;

import academy.kata.mis.medicalservice.model.entity.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VisitRepository extends JpaRepository<Visit, Long> {

    @Query("""
            SELECT vis
            FROM Visit vis
            JOIN FETCH vis.doctor
            WHERE vis.appeal.id = :appealId
            """)
    List<Visit> getVisitsToReportByAppealId(Long appealId);
}
