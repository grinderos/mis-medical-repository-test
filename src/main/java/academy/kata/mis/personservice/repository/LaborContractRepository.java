package academy.kata.mis.personservice.repository;

import academy.kata.mis.personservice.model.LaborContract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaborContractRepository extends JpaRepository<LaborContract, Long> {
}
