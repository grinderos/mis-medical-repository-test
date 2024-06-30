package academy.kata.mis.repository_test.repository;

import academy.kata.mis.repository_test.model.entity.Registrar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrarRepository extends JpaRepository<Registrar, Long> {
}
