package academy.kata.mis.repository_test.service;

import academy.kata.mis.repository_test.model.entity.Doctor;

import java.util.List;
import java.util.UUID;

public interface DoctorService {
    boolean isExistsByUserIdAndId(UUID doctorUUID, long id);

    Doctor existsByUserIdAndId(UUID doctorUUID, long id);

    Long getDoctorIdByTalonId(Long talonId);

    Long getDoctorPersonIdByTalonId(Long talonId);

    List<Doctor> findAllByUserId(UUID userId);

    boolean existDoctorByUserIdAndDoctorId(UUID userId, long doctorId);

    List<Doctor> findAllWithDepartmentsAndOrganizations(UUID userId);

    boolean isDoctorExistsById(Long id);

    long getPositionIdByDoctorId(long id);
}
