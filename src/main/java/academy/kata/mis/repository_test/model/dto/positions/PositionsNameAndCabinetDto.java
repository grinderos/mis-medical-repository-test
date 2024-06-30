package academy.kata.mis.repository_test.model.dto.positions;

import lombok.Builder;

@Builder
public record PositionsNameAndCabinetDto(long id,
                                         String name,
                                         String cabinet) {
}
