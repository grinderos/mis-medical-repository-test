package academy.kata.mis.repository_test.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Посещение
 */
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "visits")
public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * дата посещения
     */
    @Column(name = "visit_time", nullable = false)
    private LocalDateTime visitTime;

    /**
     * доктор, который принял пациента
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id", nullable = false)
    private Doctor doctor;

    /**
     * связь с обращением по заболеванию
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "appeal_id", nullable = false)
    private Appeal appeal;

    /**
     * услуги, которые были оказаны пациенту в рамках этого посещения
     */
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "visit_medical_services_dep",
            joinColumns = @JoinColumn(name = "visit_id"),
            inverseJoinColumns = @JoinColumn(name = "medical_service_dep_id"))
    private List<MedicalServiceDep> medicalServicesDep;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Visit visit = (Visit) o;
        return getId() != null && Objects.equals(getId(), visit.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
