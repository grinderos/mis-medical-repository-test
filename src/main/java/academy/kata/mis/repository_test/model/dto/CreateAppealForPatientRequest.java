package academy.kata.mis.repository_test.model.dto;

import academy.kata.mis.repository_test.model.enums.InsuranceType;

public record CreateAppealForPatientRequest(long doctorId,
                                            long patientId,
                                            long diseaseDepId,
                                            InsuranceType insuranceType) {
}
