package academy.kata.mis.personservice.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.time.LocalDate;
import java.util.Objects;

/**
 * аттестация.
 */
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "attestations")
public class Attestation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * дата начала действия аттестации
     */
    @Column(name = "date_from", nullable = false)
    private LocalDate dateFrom;

    /**
     * дата окончания действия аттестации
     */
    @Column(name = "date_to", nullable = false)
    private LocalDate dateTo;

    /**
     * номер документа
     */
    @Column(name = "number", nullable = false)
    private String number;

    /**
     * имя документа
     */
    @Column(name = "name")
    private String name;

    /**
     * файл
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "file_info_id")
    private FileInfo file;

    /**
     * образовательное учреждение
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "university_id", nullable = false)
    private University university;

    /**
     * связь с персоной
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
        Attestation that = (Attestation) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
