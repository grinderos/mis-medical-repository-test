package academy.kata.mis.personservice.service;

import academy.kata.mis.personservice.dto.person.DoctorShortDto;
import academy.kata.mis.personservice.dto.person.GetCurrentPatientInformation;
import academy.kata.mis.personservice.dto.person.PersonDto;
import academy.kata.mis.personservice.dto.person.PersonShortDto;

import java.util.UUID;

public interface PersonBusinessService {

    PersonDto findPersonById(long id);

    GetCurrentPatientInformation findCurrentPersonById(long id);

    GetCurrentPatientInformation findPersonByUserId(UUID userId);

    PersonShortDto findPersonShortInfoById(long id);

    DoctorShortDto findDoctorByPersonId(long id);

    String getPersonEmailByUserId(UUID userId);
}
