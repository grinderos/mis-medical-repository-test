package academy.kata.mis.repository_test.model.dto.person;

import lombok.Builder;

@Builder
public record PersonShortDto(long id,
                             String firstName,
                             String lastName) {
}

