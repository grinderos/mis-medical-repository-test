package academy.kata.mis.personservice.model;

import academy.kata.mis.personservice.enums.Gender;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/**
 * Персона.
 */
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "persons")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * снилс
     * уникальное поле
     */
    @Column(name = "snils", unique = true, nullable = false)
    private String snils;

    /**
     * информация о аккаунте.
     * Ссылается на mis-auth-service
     */
    @Column(name = "user_id", unique = true)
    private UUID userId;

    /**
     * имя
     */
    @Column(name = "first_name", nullable = false)
    private String firstName;

    /**
     * фамилия
     */
    @Column(name = "last_name", nullable = false)
    private String lastName;

    /**
     * отчество.
     * может отсутсвовать
     */
    @Column(name = "patronymic")
    private String patronymic;

    /**
     * день рождения
     */
    @Column(name = "birthday", nullable = false)
    private LocalDate birthday;

    /**
     * пол
     */
    @Column(name = "gender", nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    /**
     * есть ли фотография
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "person")
    private Set<Photo> photos;

    /**
     * документ подтверждающие личность
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "person")
    private Set<IdentityDocument> identityDocuments;

    /**
     * полисы
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "person")
    private Set<MedicalInsurance> insurances;

    /**
     * Дипломы.
     * Нужны только для сотрудников мед организации.
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "person")
    private Set<Diploma> diplomas;

    /**
     * аттестации.
     * Нужны только для медицинского персонала
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "person")
    private Set<Attestation> attestations;

    /**
     * трудовые договоры с сотрудником
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "person")
    private Set<LaborContract> laborContracts;

    /**
     * контактная информация
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "person")
    private Set<Contact> contacts;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Person person = (Person) o;
        return getId() != null && Objects.equals(getId(), person.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
