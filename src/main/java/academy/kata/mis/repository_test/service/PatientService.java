package academy.kata.mis.repository_test.service;

import academy.kata.mis.repository_test.model.entity.Patient;

import java.util.List;
import java.util.UUID;

public interface PatientService {
    List<Patient> findAllByUserId(UUID userId);

    Boolean existsPatientByUserIdAndOrganizationId(UUID userId, long organizationId);

    Patient getPatientById(long patientId);

    boolean isPatientExistsAndFromSameOrganizationAsDoctor(long patientId, long doctorId);

    UUID getPatientUserIdByPatientId(long patientId);

    boolean isPatientExistAndUserIdIsPatientUserId(long patientId, UUID userId);
}
