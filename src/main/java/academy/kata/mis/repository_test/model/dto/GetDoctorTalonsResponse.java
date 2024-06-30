package academy.kata.mis.repository_test.model.dto;

import academy.kata.mis.repository_test.model.dto.talon.TalonWithPatientDto;

import java.util.List;

public record GetDoctorTalonsResponse(long doctorId,
                                      String doctorFirstName,
                                      String doctorLastName,
                                      String doctorPatronymic,
                                      String doctorPositionName,
                                      List<TalonWithPatientDto> talons) {
}


