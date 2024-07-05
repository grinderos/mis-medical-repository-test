package academy.kata.mis.personservice.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;
import java.util.Set;

/**
 * образовательное учреждение.
 */
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "universities")
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * Соответствует id Компании. Ссылается на structure-service Company.id
     */
    @Column(name = "company_id", nullable = false, unique = true)
    private long companyId;

    /**
     * название университета
     */
    @Column(name = "name")
    private String name;

    /**
     * ИНН
     */
    @Column(name = "inn")
    private String inn;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "university")
    private Set<Attestation> attestations;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "university")
    private Set<Diploma> diplomas;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        University that = (University) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
