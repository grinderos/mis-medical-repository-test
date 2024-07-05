package academy.kata.mis.personservice.dto.person;

import academy.kata.mis.personservice.model.Contact;
import academy.kata.mis.personservice.model.IdentityDocument;
import lombok.Builder;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Builder
public record PatientPersonDTO(Long id,
                               String firstName,
                               String lastName,
                               String patronymic,
                               LocalDate birthday,
                               Set<IdentityDocument> identityDocuments,
                               Set<Contact> contacts) {
}
//
//p.id,
//p.firstName,
//p.lastName,
//p.patronymic,
//p.birthday,
//p.identityDocuments,
//p.contacts