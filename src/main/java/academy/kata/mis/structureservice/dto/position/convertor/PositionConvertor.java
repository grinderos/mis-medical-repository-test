package academy.kata.mis.structureservice.dto.position.convertor;

import academy.kata.mis.structureservice.dto.position.PositionDto;
import academy.kata.mis.structureservice.model.Position;
import org.springframework.stereotype.Component;

@Component
public class PositionConvertor {
    public PositionDto entityToPositionDto(Position entity) {
        return PositionDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();
    }
}
