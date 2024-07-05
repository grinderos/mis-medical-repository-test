package academy.kata.mis.structureservice.repository;

import academy.kata.mis.structureservice.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Long> {
}
