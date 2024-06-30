package academy.kata.mis.repository_test.service.impl;

import academy.kata.mis.repository_test.model.dto.disease.DiseaseShortInfoDto;
import academy.kata.mis.repository_test.model.entity.Disease;
import academy.kata.mis.repository_test.repository.DiseaseDepRepository;
import academy.kata.mis.repository_test.repository.DiseaseRepository;
import academy.kata.mis.repository_test.service.DiseaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DiseaseServiceImpl implements DiseaseService {
    private final DiseaseRepository diseaseRepository;
    private final DiseaseDepRepository diseaseDepRepository;

    @Override
    public Disease getById(long diseaseId) {
        return diseaseRepository.getReferenceById(diseaseId);
    }

    @Override
    public long getDiseaseByDiseaseDepId(long diseaseDepId) {
        return diseaseDepRepository.findDiseaseIdByDiseaseDepId(diseaseDepId);
    }

    @Override
    public Page<DiseaseShortInfoDto> getDiseaseShortInfoPagination(long doctorId,
                                                                   String diseaseName,
                                                                   String identifier,
                                                                   Pageable pageable) {
        return diseaseRepository.getDiseaseShortInfoPagination(doctorId, diseaseName, identifier, pageable);
    }
}
