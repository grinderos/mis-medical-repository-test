package academy.kata.mis.repository_test.model.dto;

import java.util.List;

public record UpdateVisitRequest(long doctorId,
                                 long visitId,
                                 List<Long> medicalServicesDepIds,
                                 boolean isClosed) {
}
