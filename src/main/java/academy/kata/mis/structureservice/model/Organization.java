package academy.kata.mis.structureservice.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Set;

/**
 * Медицинская организация
 */
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "organizations")
public class Organization {

    /**
     * Id организации.
     * Соответсвует System.id в auth-service
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * Название организации
     */
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * Адресс организации
     */
    @Column(name = "address")
    private String address;

    /**
     * уникальный код медицинской организации в системе минздрава
     * например 06500
     */
    @Column(name = "code", unique = true)
    private String code;

    /**
     * id директора.
     * информация о директоре в person-service
     */
    @Column(name = "director_id")
    private Long directorId;

    /**
     * общее количество ставок которым располагает организация.
     * Например, может быть максимум 223.75 ставок
     */
    @Column(name = "state_range", nullable = false)
    private BigDecimal stateRange;

    /**
     * отделения организации
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "organization")
    private Set<Department> departments;

    /**
     * здания которые принадлежат организации
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "organization")
    private Set<Building> buildings;

    /**
     * лицензии на осуществление медицинской деятельности.
     * могут отсутсвовать
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "organization")
    private Set<License> licenses;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Organization that = (Organization) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
