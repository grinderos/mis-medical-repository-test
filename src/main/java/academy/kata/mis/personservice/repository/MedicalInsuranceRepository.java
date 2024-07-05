package academy.kata.mis.personservice.repository;

import academy.kata.mis.personservice.model.MedicalInsurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalInsuranceRepository extends JpaRepository<MedicalInsurance, Long> {
}
