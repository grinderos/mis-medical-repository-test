package academy.kata.mis.structureservice.service;

import academy.kata.mis.structureservice.dto.position.PositionDepOrgToReportDTO;
import academy.kata.mis.structureservice.model.Position;

import java.util.Set;

public interface PositionService {
    Position getPositionById(long positionId);
    Set<PositionDepOrgToReportDTO> getPositionDepOrgToReportDTOs(Set<Long> positionIds);
}
