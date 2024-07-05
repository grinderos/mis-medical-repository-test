package academy.kata.mis.personservice.repository;

import academy.kata.mis.personservice.model.Diploma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiplomaRepository extends JpaRepository<Diploma, Long> {
}
