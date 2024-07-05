package academy.kata.mis.personservice.repository;

import academy.kata.mis.personservice.model.IdentityDocument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdentityRepository extends JpaRepository<IdentityDocument, Long> {
}
