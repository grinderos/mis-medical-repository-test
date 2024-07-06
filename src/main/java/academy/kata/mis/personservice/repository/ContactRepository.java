package academy.kata.mis.personservice.repository;

import academy.kata.mis.personservice.dto.contact.ContactToReportServiceDTO;
import academy.kata.mis.personservice.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface ContactRepository extends JpaRepository<Contact, Long> {

    @Query("""
            SELECT new academy.kata.mis.personservice.dto.contact.ContactToReportServiceDTO(
            c.id,
            c.contactType,
            c.value
            )
            FROM Contact c
            WHERE c.person.id = :personId
            """)
    Set<ContactToReportServiceDTO> getContactsByPersonId(Long personId);
}
