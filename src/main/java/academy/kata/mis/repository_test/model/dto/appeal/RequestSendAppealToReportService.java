package academy.kata.mis.repository_test.model.dto.appeal;

import lombok.Builder;

import java.util.UUID;
@Builder
public record RequestSendAppealToReportService (UUID userId, String userEmail, String info, UUID operationId) {
}
