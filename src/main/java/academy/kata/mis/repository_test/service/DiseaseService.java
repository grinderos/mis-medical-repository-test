package academy.kata.mis.repository_test.service;

import academy.kata.mis.repository_test.model.dto.disease.DiseaseShortInfoDto;
import academy.kata.mis.repository_test.model.entity.Disease;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DiseaseService {
    Disease getById(long diseaseId);
    long getDiseaseByDiseaseDepId(long diseaseDepId);
    Page<DiseaseShortInfoDto> getDiseaseShortInfoPagination(long doctorId,
                                                            String diseaseName,
                                                            String identifier,
                                                            Pageable pageable);
}
