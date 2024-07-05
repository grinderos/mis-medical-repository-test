package academy.kata.mis.structureservice.dto.position;

import lombok.Builder;

@Builder
public record PositionDto(long id, String name) {
}
