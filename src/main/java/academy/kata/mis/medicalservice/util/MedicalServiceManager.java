package academy.kata.mis.medicalservice.util;

import academy.kata.mis.medicalservice.service.*;
import academy.kata.mis.medicalservice.service.impl.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MedicalServiceManager {
    private final PatientServiceImpl patientService;
    private final DoctorServiceImpl doctorService;
    private final VisitServiceImpl visitService;
    private final TalonServiceImpl talonService;
    private final DepartmentServiceImpl departmentService;
    private final DiseaseDepServiceImpl diseaseDepService;
    private final OrganizationServiceImpl organizationService;
    private final MedicalServiceServiceImpl medicalServiceService;
    private final DiseaseServiceImpl diseaseService;
    private final DiseaseSampleServiceImpl diseaseSampleService;
    private final AppealServiceImpl appealService;
    private final MedicalServiceDepServiceImpl medicalServiceDepService;

    public PatientService getPatientService() {
        return patientService;
    }

    public DoctorService getDoctorService() {
        return doctorService;
    }

    public VisitService getVisitService() {
        return visitService;
    }

    public TalonService getTalonService() {
        return talonService;
    }

    public DepartmentService getDepartmentService() {
        return departmentService;
    }

    public DiseaseDepService getDiseaseDepService() {
        return diseaseDepService;
    }

    public OrganizationService getOrganizationService() {
        return organizationService;
    }

    public MedicalServiceService getMedicalServiceService() {
        return medicalServiceService;
    }

    public DiseaseService getDiseaseService() {
        return diseaseService;
    }

    public DiseaseSampleService getDiseaseSampleService() {
        return diseaseSampleService;
    }

    public AppealService getAppealService() {
        return appealService;
    }

    public MedicalServiceDepServiceImpl getMedicalServiceDepService() {
        return medicalServiceDepService;
    }
}
