package academy.kata.mis.personservice.model;

import academy.kata.mis.personservice.enums.PositionType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

/**
 * трудовой договор
 */
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "labor_contracts")
public class LaborContract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * дата начала трудового договора.
     */
    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    /**
     * дата окончания трудового договора.
     */
    @Column(name = "end_date")
    private LocalDate endDate;

    /**
     * id отделения в котором трудоустроен сотрудник по конкретному договору.
     * Ссылается на structure-service
     */
    @Column(name = "department_id", nullable = false)
    private long departmentId;

    /**
     * id должности которую занимает сотрудник по конкретному договору.
     * Ссылается на structure-service
     */
    @Column(name = "position_id", nullable = false)
    private long positionId;

    /**
     * ставка сотрудника по конкретному договору.
     * от 0.25 до 1.75 кратна 0.25
     */
    @Column(name = "part", nullable = false)
    private BigDecimal part;

    /**
     * тип должности - основная или совмещение.
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "position_type", nullable = false)
    private PositionType positionType;

    /**
     * файл
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "file_info_id")
    private FileInfo file;

    /**
     * персональная история сотрудника к которой прикреплен договор
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        LaborContract that = (LaborContract) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
