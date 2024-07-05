package academy.kata.mis.personservice.repository;

import academy.kata.mis.personservice.model.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityRepository extends JpaRepository<University, Long> {
}
