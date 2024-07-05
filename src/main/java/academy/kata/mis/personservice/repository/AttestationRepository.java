package academy.kata.mis.personservice.repository;

import academy.kata.mis.personservice.model.Attestation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttestationRepository extends JpaRepository<Attestation, Long> {
}
