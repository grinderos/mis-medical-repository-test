package academy.kata.mis.personservice.dto.person;

import lombok.Builder;

@Builder
public record PersonDto(long id, String firstName, String lastName) {

}
