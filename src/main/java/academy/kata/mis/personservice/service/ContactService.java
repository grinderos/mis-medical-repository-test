package academy.kata.mis.personservice.service;

import academy.kata.mis.personservice.dto.contact.ContactToReportServiceDTO;

import java.util.Set;

public interface ContactService {

    Set<ContactToReportServiceDTO> getContactsByPersonId(Long personId);
}
