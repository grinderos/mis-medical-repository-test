package academy.kata.mis.repository_test.model.dto.organization;

import lombok.Builder;

@Builder
public record OrganizationShortDto(long organizationId,
                                   String organizationName) {
}