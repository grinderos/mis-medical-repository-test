package academy.kata.mis.structureservice.service.impl;

import academy.kata.mis.structureservice.dto.position.PositionDepOrgToReportDTO;
import academy.kata.mis.structureservice.model.Position;
import academy.kata.mis.structureservice.repository.PositionRepository;
import academy.kata.mis.structureservice.service.PositionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class PositionServiceImpl implements PositionService {
    private final PositionRepository positionRepository;

    @Override
    public Position getPositionById(long positionId) {
        Position position = positionRepository.findById(positionId);

        existPosition(position, positionId);
        return positionRepository.getReferenceById(positionId);
    }


    private void existPosition(Position position, long positionId) {
        if (position == null) {
            throw new NoSuchElementException("Позиции с ID: " + positionId + " - не существует");
        }
    }

    public Set<PositionDepOrgToReportDTO> getPositionDepOrgToReportDTOs(Set<Long> positionIds){
        return positionRepository.getPositionDepOrgToReportDTOs(positionIds);
    }
}
