package academy.kata.mis.medicalservice.repository;

import academy.kata.mis.medicalservice.model.dto.talon.TalonWithDoctorPatientInfoDto;
import academy.kata.mis.medicalservice.model.entity.Talon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;
import java.util.UUID;

public interface TalonRepository extends JpaRepository<Talon, Long> {
    boolean existsTalonByIdAndPatientUserId(Long talonId, UUID id);

    @Query("""
        select t
        from Talon t
        join fetch t.doctor
        where t.patient.id = :patientId
        """)
    Set<Talon> findAllByPatientId(long patientId);

    @Query("""
           SELECT NEW academy.kata.mis.medicalservice.model.dto.talon.TalonWithDoctorPatientInfoDto(
                t.id,
                t.doctor.id,
                t.doctor.positionId,
                t.doctor.personId,
                p.id,
                p.personId,
                t.time
           )
           FROM Talon t
           left outer join t.patient p
           WHERE t.id = :talonId
           """)
    TalonWithDoctorPatientInfoDto getTalonWithDoctorPatientPersonsById(Long talonId);
}
//                (CASE WHEN t.patient.id!=NULL THEN t.patient.id END),
//        (CASE WHEN t.patient.personId!=NULL THEN t.patient.personId END),
//t.patient.id,
//t.patient.personId,

//and (CASE WHEN t.patient.id=NULL THEN 'NULL' END)
//and (CASE WHEN t.patient.personId=NULL THEN 'NULL' END)