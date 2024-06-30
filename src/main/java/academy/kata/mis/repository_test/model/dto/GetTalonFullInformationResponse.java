package academy.kata.mis.repository_test.model.dto;

import java.time.LocalDateTime;

public record GetTalonFullInformationResponse(long talonId,
                                              LocalDateTime visitTime,
                                              long organizationId,
                                              String organizationName,
                                              String organizationAddress,
                                              long doctorId,
                                              String doctorFirstName,
                                              String doctorLastName,
                                              String doctorPatronymic,
                                              String doctorPositionName,
                                              String cabinetNumber) {
}
