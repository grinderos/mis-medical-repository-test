package academy.kata.mis.structureservice.repository;

import academy.kata.mis.structureservice.model.Cabinet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CabinetRepository extends JpaRepository<Cabinet, Long> {
}
