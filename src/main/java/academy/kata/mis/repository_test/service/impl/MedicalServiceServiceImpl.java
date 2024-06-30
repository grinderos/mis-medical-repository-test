package academy.kata.mis.repository_test.service.impl;

import academy.kata.mis.repository_test.model.entity.MedicalService;
import academy.kata.mis.repository_test.repository.MedicalServiceRepository;
import academy.kata.mis.repository_test.service.MedicalServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class MedicalServiceServiceImpl implements MedicalServiceService {

    private final MedicalServiceRepository medicalServiceRepository;

    public Set<MedicalService> getMedicalServiceByServicesDepId(Set<Long> servicesDepId) {
        return medicalServiceRepository.getMedicalServiceByServicesDepId(servicesDepId);
    }
}
