package academy.kata.mis.personservice.util;

import academy.kata.mis.personservice.service.PersonBusinessService;
import academy.kata.mis.personservice.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonServiceManager {
    private final PersonService personService;
    private final PersonBusinessService personBusinessService;

    public PersonService getPersonService() {
        return personService;
    }

    public PersonBusinessService getPersonBusinessService() {
        return personBusinessService;
    }
}
