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

    @Query(value = "SELECT * FROM identity_documents (CASE WHEN status='ACTUAL' THEN document_type='PASSPORT'" +
                   "ELSE status='ACTUAL' THEN document_type='INTERNATIONAL_PASSPORT' " +
                   "ELSE status='ACTUAL' THEN document_type='BIRTH_CERTIFICATE')",
            nativeQuery = true)
    IdentityDocument getIdentityDocumentByPersonId(Long personId);
}

//@Query("""
//            SELECT idoc
//            FROM IdentityDocument idoc
//            WHERE
//            idoc.person.id = :personId and idoc.documentType = 'PASSPORT' and idoc.status = 'ACTUAL'
//            OR
//            idoc.person.id = :personId and idoc.documentType = 'INTERNATIONAL_PASSPORT' and idoc.status = 'ACTUAL'
//            OR
//            idoc.person.id = :personId and idoc.documentType = 'BIRTH_CERTIFICATE' and idoc.status = 'ACTUAL'
//            """)