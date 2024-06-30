package academy.kata.mis.repository_test.model.dto.talon;

import lombok.Builder;

@Builder
public record CancelTalonDto(Long talonId,
                             Long doctorId,
                             Long departmentId,
                             Long organizationId) {
    @Override
    public String toString() {
        return  "talonId=" + talonId +
                ", doctorId=" + doctorId +
                ", departmentId=" + departmentId +
                ", organizationId=" + organizationId +
                ".";
    }
}
