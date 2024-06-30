package academy.kata.mis.repository_test.service.impl;

import academy.kata.mis.repository_test.model.entity.DiseaseDep;
import academy.kata.mis.repository_test.repository.DiseaseDepRepository;
import academy.kata.mis.repository_test.service.DiseaseDepService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DiseaseDepServiceImpl implements DiseaseDepService {
    private final DiseaseDepRepository diseaseDepRepository;

    @Override
    public DiseaseDep getById(long diseaseDepId) {
        return diseaseDepRepository.getReferenceById(diseaseDepId);
    }

    @Override
    public boolean checkIsExistByIdAndDoctorId(long diseaseDepId, long doctorId) {
        return diseaseDepRepository.checkIsExistByIdAndDoctorId(diseaseDepId, doctorId);
    }
}
