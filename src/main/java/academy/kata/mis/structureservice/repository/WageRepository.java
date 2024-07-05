package academy.kata.mis.structureservice.repository;

import academy.kata.mis.structureservice.model.Wage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WageRepository extends JpaRepository<Wage, Long> {
}
