package academy.kata.mis.personservice.repository;

import academy.kata.mis.personservice.model.IdentityDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface IdentityRepository extends JpaRepository<IdentityDocument, Long> {

    @Query("""
            SELECT idoc
            FROM IdentityDocument idoc
            WHERE idoc.person.id = :personId
            """)
    Set<IdentityDocument> getIdentityDocumentsByPersonId(Long personId);
}
