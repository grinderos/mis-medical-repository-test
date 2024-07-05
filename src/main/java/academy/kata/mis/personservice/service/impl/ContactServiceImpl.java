package academy.kata.mis.personservice.service.impl;

import academy.kata.mis.personservice.model.Contact;
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
    public Set<Contact> getContactsByPersonId(Long personId) {
        return contactRepository.getContactsByPersonId(personId);
    }
}
