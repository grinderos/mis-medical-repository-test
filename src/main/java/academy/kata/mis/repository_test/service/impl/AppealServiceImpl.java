package academy.kata.mis.repository_test.service.impl;

import academy.kata.mis.repository_test.model.entity.Appeal;
import academy.kata.mis.repository_test.model.entity.DiseaseDep;
import academy.kata.mis.repository_test.model.entity.Patient;
import academy.kata.mis.repository_test.model.enums.AppealStatus;
import academy.kata.mis.repository_test.model.enums.InsuranceType;
import academy.kata.mis.repository_test.repository.AppealRepository;
import academy.kata.mis.repository_test.service.AppealService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class AppealServiceImpl implements AppealService {
    private final AppealRepository appealRepository;

    @Override
    public Appeal getAppealById(long appealId) {
        return appealRepository.getAppealById(appealId);
    }
    @Override
    public Appeal getAppealForReportById(long appealId) {
        return appealRepository.getAppealForReportById(appealId);
    }

    @Override
    public Appeal createPatientAppeal(DiseaseDep diseaseDep, Patient patient, InsuranceType insuranceType) {
        return Appeal.builder()
                .status(AppealStatus.OPEN)
                .insuranceType(insuranceType)
                .openDate(LocalDate.now())
                .patient(patient)
                .diseaseDep(diseaseDep)
                .build();
    }

    @Override
    @Transactional
    public Appeal save(Appeal appeal) {
        return appealRepository.save(appeal);
    }
}
