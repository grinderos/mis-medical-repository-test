package academy.kata.mis.repository_test.repository;

import academy.kata.mis.repository_test.model.entity.Appeal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AppealRepository extends JpaRepository<Appeal, Long> {
    Appeal getAppealById(long appealId);

    @Query("""
            SELECT appeal
            FROM Appeal appeal
            JOIN FETCH appeal.visits vis
            JOIN FETCH appeal.diseaseDep
            JOIN FETCH vis.medicalServicesDep
            WHERE appeal.id = :appealId
            """)
    Appeal getAppealForReportById(long appealId);


}
