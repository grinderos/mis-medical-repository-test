package academy.kata.mis.repository_test.service;

import academy.kata.mis.repository_test.model.entity.Talon;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface TalonService {
    Optional<Talon> findById(Long talonId);
    void save(Talon talon);
    boolean existsTalonByIdAndPatientUserId(Long talonId, UUID userId);
    Set<Talon> allPatientTalonByPatientId(long patientId);
}