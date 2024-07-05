package academy.kata.mis.medicalservice;

import academy.kata.mis.medicalservice.model.entity.Appeal;
import academy.kata.mis.medicalservice.util.MedicalServiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MedicalServiceRepositoryTestApplication {

    static MedicalServiceManager medicalServiceManager;

    @Autowired
    public void setServiceManager(MedicalServiceManager medicalServiceManager) {
        this.medicalServiceManager = medicalServiceManager;
    }

    public static void main(String[] args) {
        SpringApplication.run(MedicalServiceRepositoryTestApplication.class, args);

        Appeal appeal = medicalServiceManager.getAppealService().getAppealForReportById(1);
        System.out.println(appeal.getOpenDate());
    }
}
