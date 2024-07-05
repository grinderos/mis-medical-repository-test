package academy.kata.mis.personservice.model;

import academy.kata.mis.personservice.enums.InsuranceType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.time.LocalDate;
import java.util.Objects;

/**
 * полис
 */
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "medical_insurances")
public class MedicalInsurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * Страховая медицинская организация которой принадлежит полис.
     * ссылается на structure-service Company.id
     */
    @Column(name = "company_id", nullable = false)
    private long companyId;

    /**
     * тип полиса
     */
    @Column(name = "insurance_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private InsuranceType insuranceType;

    /**
     * номер
     */
    @Column(name = "number", nullable = false)
    private String number;

    /**
     * дата начала действия
     */
    @Column(name = "date_start", nullable = false)
    private LocalDate dateStart;

    /**
     * дата окончания действия
     */
    @Column(name = "date_end")
    private LocalDate dateEnd;

    /**
     * документ
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "file_info_id")
    private FileInfo file;

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
        MedicalInsurance that = (MedicalInsurance) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
