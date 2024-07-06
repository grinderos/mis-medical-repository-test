package academy.kata.mis.personservice.service;

import academy.kata.mis.personservice.dto.person.DoctorPersonToReportServiceDTO;
import academy.kata.mis.personservice.model.Person;

import java.util.Set;
import java.util.UUID;

public interface PersonService {
    Person findById(long id);

    Person findByUserId(UUID userId);

    String getPersonEmailByUserId(UUID userId);

    Person getById(Long id);

    Set<DoctorPersonToReportServiceDTO> getDoctorPersonsToReportServiceDTO(Set<Long> doctorPersonIds);
}
