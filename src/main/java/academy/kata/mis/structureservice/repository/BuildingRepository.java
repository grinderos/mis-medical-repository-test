package academy.kata.mis.structureservice.repository;

import academy.kata.mis.structureservice.model.Building;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildingRepository extends JpaRepository<Building, Long> {
}
