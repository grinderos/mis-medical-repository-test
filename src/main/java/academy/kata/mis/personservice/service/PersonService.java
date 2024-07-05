package academy.kata.mis.personservice.service;

import academy.kata.mis.personservice.model.Person;

import java.util.UUID;

public interface PersonService {
    Person findById(long id);

    Person findByUserId(UUID userId);

    String getPersonEmailByUserId(UUID userId);
}
