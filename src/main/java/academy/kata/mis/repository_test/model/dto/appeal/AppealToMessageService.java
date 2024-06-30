package academy.kata.mis.repository_test.model.dto.appeal;

import lombok.Builder;

@Builder
public record AppealToMessageService(String type, String userEmail, String subject, String text) {
}
