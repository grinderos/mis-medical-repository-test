package academy.kata.mis.medicalservice.service.impl;

import academy.kata.mis.medicalservice.model.entity.MedicalServiceDep;
import academy.kata.mis.medicalservice.repository.MedicalServiceDepRepository;
import academy.kata.mis.medicalservice.service.MedicalServiceDepService;
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
