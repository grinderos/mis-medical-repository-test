package academy.kata.mis.personservice.util;

import academy.kata.mis.personservice.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonServiceManager {
    private final PersonService personService;

    public PersonService getPersonService() {
        return personService;
    }
}
