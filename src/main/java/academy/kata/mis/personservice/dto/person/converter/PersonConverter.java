package academy.kata.mis.personservice.dto.person.converter;

import academy.kata.mis.personservice.dto.person.GetCurrentPatientInformation;
import academy.kata.mis.personservice.dto.person.DoctorShortDto;
import academy.kata.mis.personservice.dto.person.PersonDto;
import academy.kata.mis.personservice.dto.person.PersonShortDto;
import academy.kata.mis.personservice.model.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonConverter {

    public PersonDto entityToPersonDto(Person entity) {
        return PersonDto.builder()
                .id(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .build();
    }
    public GetCurrentPatientInformation entityToPersonDtoOuter(Person entity) {
        return GetCurrentPatientInformation.builder()
                .id(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .patronymic(entity.getPatronymic())
                .birthday(entity.getBirthday())
                .build();
    }

    public PersonShortDto entityToPersonShortDto(Person entity) {
        return PersonShortDto.builder()
                .id(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .patronymic(entity.getPatronymic())
                .build();
    }

    public DoctorShortDto entityToDoctorShortDto(Person entity) {
        return DoctorShortDto.builder()
                .doctorId(entity.getId())
                .doctorFirstName(entity.getFirstName())
                .doctorLastName(entity.getLastName())
                .patronymic(entity.getPatronymic())
                .doctorPositionName(null)
                .build();
    }
}
