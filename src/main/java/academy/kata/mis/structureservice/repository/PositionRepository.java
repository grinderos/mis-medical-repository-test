package academy.kata.mis.structureservice.repository;

import academy.kata.mis.structureservice.dto.department_organization_position_cabinet.DepartmentOrganizationPositionCabinetNameDto;
import academy.kata.mis.structureservice.dto.positions.RepPositionsDepartmentOrganizationDto;
import academy.kata.mis.structureservice.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends JpaRepository<Position, Long> {
    Position findById(long id);

    @Query("""
            SELECT case when (count(p.id) > 0) then true else false
            END from Position p where p.id = :id
            """)
    boolean isPositionExistsById(long id);

    @Query("""
            SELECT new academy.kata.mis.structureservice.dto.department_organization_position_cabinet
            .DepartmentOrganizationPositionCabinetNameDto(
                pos.department.id,
                pos.department.name,
                pos.department.organization.id,
                pos.department.organization.name,
                pos.name,
                pos.cabinet.value) 
            FROM Position pos
            WHERE pos.id = :positionId
            """)
    DepartmentOrganizationPositionCabinetNameDto getDepartmentOrganizationPositionCabinetName(long positionId);

    @Query("""
            SELECT new academy.kata.mis.structureservice.dto.positions.RepPositionsDepartmentOrganizationDto(
            pos.id,
            pos.name,
            pos.department.id,
            pos.department.name,
            pos.department.organization.id,
            pos.department.organization.name
            )
            FROM Position pos
            WHERE pos.id = :positionId
            """)
    RepPositionsDepartmentOrganizationDto getRepPositionsDepartmentOrganizationDto(@Param("positionId") long positionId);


}

