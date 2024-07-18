package academy.kata.mis.structureservice;

import academy.kata.mis.structureservice.dto.position.PositionDepOrgToReportDTO;
import academy.kata.mis.structureservice.model.Department;
import academy.kata.mis.structureservice.util.StructureServiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;


@SpringBootApplication
public class StructureServiceRepositoryTestApplication {

    static StructureServiceManager structureServiceManager;

    @Autowired
    public void setServiceManager(StructureServiceManager structureServiceManager) {
        this.structureServiceManager = structureServiceManager;
    }

    public static void main(String[] args) {
        SpringApplication.run(StructureServiceRepositoryTestApplication.class, args);

//        Department department = structureServiceManager.getDepartmentService().getDepartmentAndOrganizationByDepartmentID(1L);
//        System.out.println(department.getName());

        Set<PositionDepOrgToReportDTO> positions = structureServiceManager.getPositionService()
                .getPositionDepOrgToReportDTOs(Set.of(2L,12L,22L));

        System.out.println(positions);
    }
}
