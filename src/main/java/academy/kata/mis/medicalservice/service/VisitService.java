package academy.kata.mis.medicalservice.service;

import academy.kata.mis.medicalservice.model.entity.Appeal;
import academy.kata.mis.medicalservice.model.entity.Doctor;
import academy.kata.mis.medicalservice.model.entity.Visit;

import java.util.List;

public interface VisitService {
    Visit createPatientVisit(Doctor doctor, Appeal appeal);

    Visit save(Visit visit);

    Visit findById(long id);

    List<Visit> getVisitsByAppealId(Long appealId);
}
