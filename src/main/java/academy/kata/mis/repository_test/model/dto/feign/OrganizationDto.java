package academy.kata.mis.repository_test.model.dto.feign;

import lombok.Builder;

@Builder
public record OrganizationDto(long id, String name) {

    public String getName() {
        return name;
    }
}
