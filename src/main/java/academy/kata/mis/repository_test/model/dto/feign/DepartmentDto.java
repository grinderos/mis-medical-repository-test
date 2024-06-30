package academy.kata.mis.repository_test.model.dto.feign;

import lombok.Builder;

@Builder
public record DepartmentDto(long id, String name) {

    public String getName() {
        return name;
    }
}


