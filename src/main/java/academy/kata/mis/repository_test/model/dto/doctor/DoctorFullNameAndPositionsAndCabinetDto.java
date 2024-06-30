package academy.kata.mis.repository_test.model.dto.doctor;

import lombok.Builder;

@Builder
public record DoctorFullNameAndPositionsAndCabinetDto(String doctorFirstName,
                                                      String doctorLastName,
                                                      String patronymic,
                                                      String positionsName,
                                                      String cabinet
) {
}
