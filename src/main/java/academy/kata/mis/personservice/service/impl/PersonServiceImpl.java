package academy.kata.mis.personservice.service.impl;

import academy.kata.mis.personservice.model.Person;
import academy.kata.mis.personservice.repository.PersonRepository;
import academy.kata.mis.personservice.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;

    @Override
    public Person findById(long id) {
        return personRepository.getReferenceById(id);
    }

    @Override
    public Person findByUserId(UUID userId) {
        return personRepository.findByUserId(userId);
    }

    @Override
    public String getPersonEmailByUserId(UUID userId) {
        return personRepository.getPersonEmailByUserId(userId);
    }
}
