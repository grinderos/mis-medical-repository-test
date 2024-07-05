package academy.kata.mis.personservice.repository;

import academy.kata.mis.personservice.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface PersonRepository extends JpaRepository<Person, Long> {
    @Query("select p from Person p where p.userId = :userId")
    Person findByUserId(UUID userId);

    @Query("""
            SELECT c.value
            FROM Person p JOIN Contact c ON p.id = c.person.id
            WHERE p.userId =:userId AND c.contactType = 'EMAIL'
            """)
    String getPersonEmailByUserId(UUID userId);
}
