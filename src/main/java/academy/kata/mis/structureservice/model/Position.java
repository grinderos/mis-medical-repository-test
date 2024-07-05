package academy.kata.mis.structureservice.model;

import academy.kata.mis.structureservice.enums.PositionStatus;
import academy.kata.mis.structureservice.enums.PositionType;
import academy.kata.mis.structureservice.enums.WorkSchedule;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;
import java.util.Set;

/**
 * Должность
 */
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "positions")
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * тип должности
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private PositionType type;

    /**
     * тип должности
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private PositionStatus status;

    /**
     * график работы
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "work_schedule", nullable = false)
    private WorkSchedule workSchedule;


    /**
     * название должности
     */
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * отпускные дни положенные сотруднику за 1 календарный год
     * у врачей 42, у остальных 28
     */
    @Column(name = "days_for_vocation", nullable = false)
    private int daysForVocation;

    /**
     * Документы сопровождающие текущую должность, например должностная инструкция
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "position")
    private Set<Document> documents;

    /**
     * действующие оклады
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "position")
    private Set<Wage> wages;

    /**
     * кабинет в котором числится должность
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cabinet_id")
    private Cabinet cabinet;

    /**
     * принадлежность к конкретному отделению
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Position position = (Position) o;
        return getId() != null && Objects.equals(getId(), position.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
