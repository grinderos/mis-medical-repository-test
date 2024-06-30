package academy.kata.mis.repository_test;

import academy.kata.mis.repository_test.model.entity.Appeal;
import academy.kata.mis.repository_test.model.entity.Visit;
import academy.kata.mis.repository_test.util.ServiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@SpringBootApplication
public class RepositoryTestApplication {

    static ServiceManager serviceManager;

    @Autowired
    public void setServiceManager(ServiceManager serviceManager) {
        this.serviceManager = serviceManager;
    }

    public static void main(String[] args) {
        SpringApplication.run(RepositoryTestApplication.class, args);

        System.out.println("---получаем appeal---");
        Appeal appeal = serviceManager.getAppealService().getAppealForReportById(2);
        System.out.println("---получаем visits---");
        Set<Visit> visits = appeal.getVisits();

        System.out.println("----- запрос через сущность -----");
        List<Long> medicalServicesDepId = visits.stream()
                .flatMap(visit -> visit.getMedicalServicesDep().stream().map(order -> order.getId()))
                .collect(Collectors.toList());
        System.out.println("medicalServicesDepId: "+medicalServicesDepId);

    }

}
