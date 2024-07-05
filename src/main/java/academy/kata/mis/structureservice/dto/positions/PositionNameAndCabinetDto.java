package academy.kata.mis.structureservice.dto.positions;

import lombok.Builder;

@Builder
public record PositionNameAndCabinetDto (long id,
                                         String name,
                                         String cabinet) {
}
