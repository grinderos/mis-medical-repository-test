package academy.kata.mis.personservice.dto.person;

import lombok.Builder;

@Builder
public record PersonShortDto(long id,
                             String firstName,
                             String lastName,
                             String patronymic) {
}
