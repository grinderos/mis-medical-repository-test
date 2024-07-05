package academy.kata.mis.personservice.service.impl;

import academy.kata.mis.personservice.dto.person.DoctorShortDto;
import academy.kata.mis.personservice.dto.person.GetCurrentPatientInformation;
import academy.kata.mis.personservice.dto.person.PersonDto;
import academy.kata.mis.personservice.dto.person.PersonShortDto;
import academy.kata.mis.personservice.dto.person.converter.PersonConverter;
import academy.kata.mis.personservice.service.PersonBusinessService;
import academy.kata.mis.personservice.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PersonBusinessServiceImpl implements PersonBusinessService {
    private final PersonService personService;
    private final PersonConverter personConverter;


    @Override
    public PersonDto findPersonById(long id) {
        return personConverter.entityToPersonDto(
                personService.findById(id));
    }

    @Override
    public GetCurrentPatientInformation findCurrentPersonById(long id) {
        return personConverter.entityToPersonDtoOuter(
                personService.findById(id));
    }

    @Override
    public GetCurrentPatientInformation findPersonByUserId(UUID userId) {
        return personConverter.entityToPersonDtoOuter(
                personService.findByUserId(userId));
    }

    @Override
    public PersonShortDto findPersonShortInfoById(long id) {
        return personConverter.entityToPersonShortDto(
                personService.findById(id)
        );
    }

    @Override
    public DoctorShortDto findDoctorByPersonId(long id) {
        return personConverter.entityToDoctorShortDto(
                personService.findById(id)
        );
    }

    @Override
    public String getPersonEmailByUserId(UUID userId) {
        return personService.getPersonEmailByUserId(userId);
    }
}
