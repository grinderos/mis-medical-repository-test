package academy.kata.mis.repository_test.service;

import academy.kata.mis.repository_test.model.entity.DiseaseDep;

public interface DiseaseDepService {
    DiseaseDep getById(long diseaseDepId);

    boolean checkIsExistByIdAndDoctorId(long diseaseDepId, long doctorId);
}
