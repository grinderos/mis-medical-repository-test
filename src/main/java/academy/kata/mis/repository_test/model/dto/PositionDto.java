package academy.kata.mis.repository_test.model.dto;

import lombok.Builder;

@Builder


public record PositionDto(long id, String name) {

    public String getName() {
        return name;
    }
}
