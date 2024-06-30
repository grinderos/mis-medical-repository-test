package academy.kata.mis.repository_test.model.dto.feign;

import lombok.Builder;


@Builder
public record PersonDto(long id, String firstName, String lastName) {
}

