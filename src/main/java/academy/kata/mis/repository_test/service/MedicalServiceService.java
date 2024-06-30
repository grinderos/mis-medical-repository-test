package academy.kata.mis.repository_test.service;

import academy.kata.mis.repository_test.model.entity.MedicalService;

import java.util.Set;

public interface MedicalServiceService {

    Set<MedicalService> getMedicalServiceByServicesDepId(Set<Long> servicesDepId);
}
