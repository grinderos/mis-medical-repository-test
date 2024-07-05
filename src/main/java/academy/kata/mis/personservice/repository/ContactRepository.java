package academy.kata.mis.personservice.repository;

import academy.kata.mis.personservice.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
