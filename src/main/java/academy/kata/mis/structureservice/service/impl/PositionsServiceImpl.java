package academy.kata.mis.structureservice.service.impl;

import academy.kata.mis.structureservice.dto.department_organization_position_cabinet.DepartmentOrganizationPositionCabinetNameDto;
import academy.kata.mis.structureservice.dto.positions.RepPositionsDepartmentOrganizationDto;
import academy.kata.mis.structureservice.model.Position;
import academy.kata.mis.structureservice.repository.PositionRepository;
import academy.kata.mis.structureservice.service.PositionsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class PositionsServiceImpl implements PositionsService {
    private final PositionRepository positionRepository;

    @Override
    public Position getPositionNameAndCabinet(long id) {
        Position position = positionRepository.findById(id);
        existPosition(position, id);
        return position;
    }

    private void existPosition(Position position, long id) {
        if (position == null) {
            throw new NoSuchElementException("Позиции с ID: " + id + " - не существует");
        }
    }

    @Override
    public RepPositionsDepartmentOrganizationDto getRepPositionsDepartmentOrganizationDto(long positionId) {
        RepPositionsDepartmentOrganizationDto repPositionsDepartmentOrganizationDto = positionRepository.getRepPositionsDepartmentOrganizationDto(positionId);

        existRepPositionsDepartmentOrganizationDto(repPositionsDepartmentOrganizationDto, positionId);
        return repPositionsDepartmentOrganizationDto;
    }

    private void existRepPositionsDepartmentOrganizationDto(RepPositionsDepartmentOrganizationDto repPositionsDepartmentOrganizationDto, long id) {
        if (repPositionsDepartmentOrganizationDto == null) {
            throw new NoSuchElementException("Не удалось связать позицию с ID: " + id + "с департаментом и организацией, или такая позиция не существует");
        }
    }

    @Override
    public boolean isPositionExistsById(long id) {
        return positionRepository.isPositionExistsById(id);
    }

    @Override
    public DepartmentOrganizationPositionCabinetNameDto getDepartmentOrganizationPositionCabinetName(long positionId) {
        return positionRepository.getDepartmentOrganizationPositionCabinetName(positionId);
    }
}
