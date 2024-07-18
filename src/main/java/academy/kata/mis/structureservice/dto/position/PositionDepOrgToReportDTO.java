package academy.kata.mis.structureservice.dto.position;

public record PositionDepOrgToReportDTO(Long positionId,
                                        Long departmentId,
                                        String departmentName,
                                        Long organizationId,
                                        String organizationName,
                                        String organizationAddress) {
}
