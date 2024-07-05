package academy.kata.mis.personservice.service;

import academy.kata.mis.personservice.model.Contact;

import java.util.Set;

public interface ContactService {

    Set<Contact> getContactsByPersonId(Long personId);
}
