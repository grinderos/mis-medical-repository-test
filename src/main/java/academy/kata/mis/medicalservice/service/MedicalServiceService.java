package academy.kata.mis.medicalservice.service;

import academy.kata.mis.medicalservice.model.dto.service.MedicalServiceToReportDTO;
import academy.kata.mis.medicalservice.model.entity.MedicalService;

import java.util.List;
import java.util.Set;

public interface MedicalServiceService {

    Set<MedicalService> getMedicalServiceByServicesDepId(Set<Long> servicesDepId);

    List<MedicalServiceToReportDTO> getMedicalServiceToReportDTOsByVisitId(List<Long> visitIds);
}
