package academy.kata.mis.repository_test.service;

import academy.kata.mis.repository_test.model.entity.Appeal;
import academy.kata.mis.repository_test.model.entity.DiseaseDep;
import academy.kata.mis.repository_test.model.entity.Patient;
import academy.kata.mis.repository_test.model.enums.InsuranceType;

public interface AppealService {
    Appeal createPatientAppeal(DiseaseDep diseaseDep, Patient patient, InsuranceType insuranceType);

    Appeal save(Appeal appeal);

    Appeal getAppealById(long appealId);
    Appeal getAppealForReportById(long appealId);
}
