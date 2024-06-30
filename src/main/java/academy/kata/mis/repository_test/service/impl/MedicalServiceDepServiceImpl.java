package academy.kata.mis.repository_test.service.impl;

import academy.kata.mis.repository_test.model.entity.MedicalServiceDep;
import academy.kata.mis.repository_test.repository.MedicalServiceDepRepository;
import academy.kata.mis.repository_test.service.MedicalServiceDepService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
public class MedicalServiceDepServiceImpl implements MedicalServiceDepService {

    MedicalServiceDepRepository medicalServiceDepRepository;
    @Override
    public List<MedicalServiceDep> getMedicalServiceDepByVisitIds(List<Long> medServDepIds) {
        return medicalServiceDepRepository.getMedicalServiceDepByVisitIds(medServDepIds);
    }
}
