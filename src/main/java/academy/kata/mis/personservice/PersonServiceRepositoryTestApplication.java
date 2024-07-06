package academy.kata.mis.personservice;

import academy.kata.mis.personservice.dto.contact.ContactToReportServiceDTO;
import academy.kata.mis.personservice.dto.person.DoctorPersonToReportServiceDTO;
import academy.kata.mis.personservice.dto.person.PatientPersonToReportServiceDTO;
import academy.kata.mis.personservice.dto.person.PersonToReportServiceDTO;
import academy.kata.mis.personservice.enums.DocumentStatus;
import academy.kata.mis.personservice.enums.IdentityDocumentType;
import academy.kata.mis.personservice.model.IdentityDocument;
import academy.kata.mis.personservice.model.Person;
import academy.kata.mis.personservice.util.PersonServiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;


@SpringBootApplication
public class PersonServiceRepositoryTestApplication {

    static PersonServiceManager personServiceManager;

    @Autowired
    public void setServiceManager(PersonServiceManager personServiceManager) {
        this.personServiceManager = personServiceManager;
    }

    public static void main(String[] args) {
        SpringApplication.run(PersonServiceRepositoryTestApplication.class, args);

        Long patientPersonId = 1L;
        Set<Long> doctorPersonIds = Set.of(1L, 3L, 5L);
        Person patient = personServiceManager.getPersonService().getById(patientPersonId);
        Set<IdentityDocument> documents = personServiceManager.getIdentityService().getIdentityDocumentsByPersonId(patientPersonId);
        Set<ContactToReportServiceDTO> contacts = personServiceManager.getContactService().getContactsByPersonId(patientPersonId);
        Set<DoctorPersonToReportServiceDTO> doctors = personServiceManager.getPersonService().getDoctorPersonsToReportServiceDTO(doctorPersonIds);

        IdentityDocument document = null;
        for (IdentityDocument doc : documents) {
            if ((document = doc).getDocumentType().equals(IdentityDocumentType.PASSPORT)
                && document.getStatus().equals(DocumentStatus.ACTUAL)) {
                break;
            } else if (document.getDocumentType().equals(IdentityDocumentType.INTERNATIONAL_PASSPORT)
                       && document.getStatus().equals(DocumentStatus.ACTUAL)) {
                break;
            }
        }

        PersonToReportServiceDTO dto = PersonToReportServiceDTO.builder()
                .patient(
                        PatientPersonToReportServiceDTO.builder()
                                .personId(patient.getId())
                                .firstName(patient.getFirstName())
                                .lastName(patient.getLastName())
                                .patronymic(patient.getPatronymic())
                                .birthday(patient.getBirthday())
                                .documentType(document.getDocumentType())
                                .documentNumber(document.getNumber())
                                .contacts(contacts)
                                .build()
                )
                .doctors(doctors)
                .build();
        System.out.println(dto);

//        System.out.println(document);
//        System.out.println(patient.getId());
//        System.out.println(patient.getFirstName());
//        System.out.println(patient.getLastName());
//        System.out.println(patient.getPatronymic());
//        System.out.println(patient.getBirthday());
//        System.out.println(patient.getIdentityDocuments());
//        System.out.println(patient.getContacts());
    }
}
