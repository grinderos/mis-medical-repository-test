package academy.kata.mis.medicalservice.service.impl;

import academy.kata.mis.medicalservice.model.entity.Appeal;
import academy.kata.mis.medicalservice.model.entity.Doctor;
import academy.kata.mis.medicalservice.model.entity.Visit;
import academy.kata.mis.medicalservice.repository.VisitRepository;
import academy.kata.mis.medicalservice.service.VisitService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VisitServiceImpl implements VisitService {
    private final VisitRepository visitRepository;

    @Override
    public Visit createPatientVisit(Doctor doctor, Appeal appeal) {
        return Visit.builder()
                .visitTime(LocalDate.now().atStartOfDay())
                .doctor(doctor)
                .appeal(appeal)
                .build();
    }

    @Override
    @Transactional
    public Visit save(Visit visit) {
        return visitRepository.save(visit);
    }

    public Visit findById(long id) {
       return visitRepository.findById(id).get();
    }

    @Override
    public List<Visit> getVisitsByAppealId(Long appealId){
        return visitRepository.getVisitsToReportByAppealId(appealId);
    }

//    @Override
//    public Visit getVisitsByVisitDate(long appealId) {
//        return visitRepository.getStartVisitByAppealId(appealId);
//    }


}
