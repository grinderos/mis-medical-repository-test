package academy.kata.mis.medicalservice.repository;

import academy.kata.mis.medicalservice.model.entity.Appeal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AppealRepository extends JpaRepository<Appeal, Long> {
    Appeal getAppealById(long appealId);

    @Query("""
            SELECT appeal
            FROM Appeal appeal
            JOIN FETCH appeal.patient
            JOIN FETCH appeal.diseaseDep
            JOIN FETCH appeal.diseaseDep.disease
            WHERE appeal.id = :appealId
            """)
    Appeal getAppealForReportById(long appealId);
}
