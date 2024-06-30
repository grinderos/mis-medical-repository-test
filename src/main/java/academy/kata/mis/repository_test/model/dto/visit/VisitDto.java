package academy.kata.mis.repository_test.model.dto.visit;

import academy.kata.mis.repository_test.model.dto.doctor.DoctorShortDto;
import academy.kata.mis.repository_test.model.dto.service.MedicalServiceShortDto;

import java.time.LocalDateTime;
import java.util.List;

public record VisitDto(long visitId,
                       LocalDateTime visitTime,
                       DoctorShortDto doctor,
                       List<MedicalServiceShortDto> medicalServices) {
}
