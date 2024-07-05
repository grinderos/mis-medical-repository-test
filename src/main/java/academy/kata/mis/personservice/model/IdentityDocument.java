package academy.kata.mis.personservice.model;

import academy.kata.mis.personservice.enums.DocumentStatus;
import academy.kata.mis.personservice.enums.Gender;
import academy.kata.mis.personservice.enums.IdentityDocumentType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.time.LocalDate;
import java.util.Objects;

/**
 * документ подтверждающий личность.
 */
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "identity_documents")
public class IdentityDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * тип документа
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "document_type", nullable = false)
    private IdentityDocumentType documentType;

    /**
     * Актуальность документа
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private DocumentStatus status;

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
     * файл
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "file_info_id")
    private FileInfo file;

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
        IdentityDocument that = (IdentityDocument) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
