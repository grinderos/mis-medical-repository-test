package academy.kata.mis.structureservice.dto.organization;

import lombok.Builder;

@Builder
public record OrganizationDto(long id, String name) {
}
