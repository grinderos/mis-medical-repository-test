package academy.kata.mis.structureservice.dto.department;

import lombok.Builder;

@Builder
public record DepartmentDto(long id, String name) {
}