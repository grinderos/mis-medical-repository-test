package academy.kata.mis.repository_test.service;

import academy.kata.mis.repository_test.model.entity.Appeal;
import academy.kata.mis.repository_test.model.entity.Doctor;
import academy.kata.mis.repository_test.model.entity.Visit;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

public interface VisitService {
    Visit createPatientVisit(Doctor doctor, Appeal appeal);

    Visit save(Visit visit);

    Visit findById(long id);

    //    Visit getVisitsByVisitDate(LocalDateTime startTime);
//    Visit getVisitsByVisitDate(Timestamp startDate);
//    Visit getVisitsByVisitDate(long appealId);
}
