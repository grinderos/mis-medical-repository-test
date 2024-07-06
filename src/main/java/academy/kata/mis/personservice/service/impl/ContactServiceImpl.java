package academy.kata.mis.personservice.service.impl;

import academy.kata.mis.personservice.dto.contact.ContactToReportServiceDTO;
import academy.kata.mis.personservice.repository.ContactRepository;
import academy.kata.mis.personservice.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {
    private final ContactRepository contactRepository;

    @Override
    public Set<ContactToReportServiceDTO> getContactsByPersonId(Long personId) {
        return contactRepository.getContactsByPersonId(personId);
    }
}
