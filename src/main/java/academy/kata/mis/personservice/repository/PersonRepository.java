package academy.kata.mis.personservice.repository;

import academy.kata.mis.personservice.dto.person.DoctorPersonToReportServiceDTO;
import academy.kata.mis.personservice.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;
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

    Person getById(Long id);

    @Query("""
            SELECT NEW academy.kata.mis.personservice.dto.person.DoctorPersonToReportServiceDTO(
            p.id,
            p.firstName,
            p.lastName,
            p.patronymic
            )
            FROM Person p
            WHERE p.id IN :doctorPersonIds
            """)
    Set<DoctorPersonToReportServiceDTO> getDoctorPersonsToReportServiceDTO(Set<Long> doctorPersonIds);
}