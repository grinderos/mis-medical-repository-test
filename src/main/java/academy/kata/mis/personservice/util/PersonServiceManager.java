package academy.kata.mis.personservice.util;

import academy.kata.mis.personservice.service.ContactService;
import academy.kata.mis.personservice.service.IdentityService;
import academy.kata.mis.personservice.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonServiceManager {
    private final PersonService personService;
    private final IdentityService identityService;
    private final ContactService contactService;

    public PersonService getPersonService() {
        return personService;
    }
    public IdentityService getIdentityService() {return identityService;}
    public ContactService getContactService() {return contactService;}
}
