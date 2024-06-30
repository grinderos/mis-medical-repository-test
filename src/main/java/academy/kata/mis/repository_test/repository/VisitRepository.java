package academy.kata.mis.repository_test.repository;

import academy.kata.mis.repository_test.model.entity.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface VisitRepository extends JpaRepository<Visit, Long> {

//    @Query("""
//            SELECT vis
//            FROM Visit vis
//            WHERE vis.visitTime = (SELECT min(visitTime) FROM vis WHERE visitTime>=CAST(:timeStart as date))
//""")
//    Visit getVisitsByVisitDate(Timestamp timeStart);

//    @Query("""
//            SELECT vis
//            FROM Visit vis
//            WHERE vis.visitTime = (SELECT app.openDate FROM Appeal app WHERE app.id=:appealId)
//            """)
//    Visit getStartVisitByAppealId(long appealId);
}
