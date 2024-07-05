package academy.kata.mis.medicalservice.service;

import academy.kata.mis.medicalservice.model.entity.MedicalServiceDep;

import java.util.List;

public interface MedicalServiceDepService {
    List<MedicalServiceDep> getMedicalServiceDepByVisitIds(List<Long> visitIds);
}
