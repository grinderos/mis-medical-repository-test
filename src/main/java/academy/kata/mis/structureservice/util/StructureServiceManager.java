package academy.kata.mis.structureservice.util;

import academy.kata.mis.structureservice.service.DepartmentService;
import academy.kata.mis.structureservice.service.OrganizationService;
import academy.kata.mis.structureservice.service.PositionService;
import academy.kata.mis.structureservice.service.PositionsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StructureServiceManager {
    private final DepartmentService departmentService;
    private final OrganizationService organizationService;
    private final PositionService positionService;
    private final PositionsService positionsService;

    public DepartmentService getDepartmentService() {
        return departmentService;
    }

    public OrganizationService getOrganizationService() {
        return organizationService;
    }

    public PositionService getPositionService() {
        return positionService;
    }

    public PositionsService getPositionsService() {
        return positionsService;
    }
}
