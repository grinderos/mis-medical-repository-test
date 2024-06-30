package academy.kata.mis.repository_test.model.dto.talon.converter;

import academy.kata.mis.repository_test.model.dto.doctor.DoctorFullNameAndPositionsAndCabinetDto;
import academy.kata.mis.repository_test.model.dto.talon.TalonWithDoctorShortDto;
import academy.kata.mis.repository_test.model.entity.Talon;
import org.springframework.stereotype.Component;

@Component
public class TalonConverter {

    public TalonWithDoctorShortDto entityToTalonWithDoctorShortDto(Talon talon,
                                                                   DoctorFullNameAndPositionsAndCabinetDto doctorFullNameAndPositionsAndCabinetDto) {
        return TalonWithDoctorShortDto.builder()
                .talonId(talon.getId())
                .visitTime(talon.getTime())
                .doctorId(talon.getDoctor().getId())
                .doctorFirstName(doctorFullNameAndPositionsAndCabinetDto.doctorFirstName())
                .doctorLastName(doctorFullNameAndPositionsAndCabinetDto.doctorLastName())
                .doctorPositionName(doctorFullNameAndPositionsAndCabinetDto.positionsName())
                .doctorPatronymic(doctorFullNameAndPositionsAndCabinetDto.patronymic())
                .cabinet(doctorFullNameAndPositionsAndCabinetDto.cabinet())
                .build();
    }
}
