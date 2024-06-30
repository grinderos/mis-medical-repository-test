package academy.kata.mis.repository_test.service;

import java.util.Set;

public interface DiseaseSampleService {

    Set<Long> getServiceDepIdByDoctorIdAndDiseaseDepId(long doctorId, long diseaseDepId);

    Set<Long> getDiseaseSamplesIdByDoctorIdAndDiseaseId(long doctorId, long diseaseDepId);

    Set<Long> getServiceDepIdByDiseaseSampleId(long diseaseSampleId);
}