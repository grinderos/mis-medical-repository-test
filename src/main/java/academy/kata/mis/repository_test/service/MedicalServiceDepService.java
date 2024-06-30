package academy.kata.mis.repository_test.service;

import academy.kata.mis.repository_test.model.entity.MedicalServiceDep;

import java.util.List;
import java.util.Set;

public interface MedicalServiceDepService {
    List<MedicalServiceDep> getMedicalServiceDepByVisitIds(List<Long> visitIds);
}
