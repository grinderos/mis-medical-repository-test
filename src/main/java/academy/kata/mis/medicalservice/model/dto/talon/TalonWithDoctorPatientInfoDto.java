package academy.kata.mis.medicalservice.model.dto.talon;

import academy.kata.mis.medicalservice.model.entity.Patient;
import lombok.Builder;
import java.time.LocalDateTime;

@Builder
public record TalonWithDoctorPatientInfoDto(Long talonId,
                                            Long doctorId,
                                            Long doctorPositionId,
                                            Long doctorPersonId,
                                            Long patientId,
                                            Long personId,
                                            LocalDateTime talonTime) {
}
