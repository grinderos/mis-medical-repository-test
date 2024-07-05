package academy.kata.mis.medicalservice.repository;

import academy.kata.mis.medicalservice.model.dto.service.MedicalServiceToReportDTO;
import academy.kata.mis.medicalservice.model.entity.MedicalService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

public interface MedicalServiceRepository extends JpaRepository<MedicalService, Long> {

    @Query("""
            SELECT ms
            FROM MedicalService ms
               JOIN FETCH ms.servicesDep sd
            WHERE sd.id IN :servicesDepId
            """)
    Set<MedicalService> getMedicalServiceByServicesDepId(Set<Long> servicesDepId);

    @Query("""
            SELECT NEW academy.kata.mis.medicalservice.model.dto.service.MedicalServiceToReportDTO(
            msd.medicalService.id,
            msd.medicalService.name,
            msd.id,
            vis.id
            )
            FROM MedicalServiceDep msd
            JOIN msd.visits vis
            WHERE vis.id IN :visitIds
            """)
    List<MedicalServiceToReportDTO> getMedicalServiceToReportDTOsByVisitId(List<Long> visitIds);
}
