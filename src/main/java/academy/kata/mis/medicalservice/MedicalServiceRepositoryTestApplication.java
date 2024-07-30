package academy.kata.mis.medicalservice;

import academy.kata.mis.medicalservice.model.dto.talon.TalonWithDoctorPatientInfoDto;
import academy.kata.mis.medicalservice.util.MedicalServiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;


@SpringBootApplication
public class MedicalServiceRepositoryTestApplication {

    static MedicalServiceManager medicalServiceManager;

    @Autowired
    public void setServiceManager(MedicalServiceManager medicalServiceManager) {
        this.medicalServiceManager = medicalServiceManager;
    }

    public static void main(String[] args) {
        SpringApplication.run(MedicalServiceRepositoryTestApplication.class, args);

//        Appeal appeal = medicalServiceManager.getAppealService().getAppealForReportById(1);
//        System.out.println(appeal.getOpenDate());

//        TalonWithDoctorPatientInfoDto talon = medicalServiceManager.getTalonService().getTalonWithDoctorPatientPersonsById(2L);
//        System.out.println(talon);

        System.out.println(medicalServiceManager.getDoctorService().areDoctorsInSameDepartment(1L, UUID.fromString("31c2cd49-939a-4227-ae8e-c95b0a4456b6")));
    }
}
