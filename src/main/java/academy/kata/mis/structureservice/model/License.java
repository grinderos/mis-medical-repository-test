package academy.kata.mis.structureservice.model;

import academy.kata.mis.structureservice.enums.DocumentType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "licenses")
public class License {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * наименование
     */
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * описание
     */
    @Column(name = "description")
    private String description;

    /**
     * Дата окончания действия документа.
     */
    @Column(name = "date_from", nullable = false)
    private LocalDate dateFrom;

    /**
     * Дата окончания действия документа.
     */
    @Column(name = "date_to", nullable = false)
    private LocalDate dateTo;

    /**
     * идентификатор документа в сервисе-хранилище документов
     */
    @Column(name = "document_id", nullable = false)
    private UUID documentId;

    /**
     * тип документа
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private DocumentType type;

    /**
     * вес документа
     */
    @Column(name = "size", nullable = false)
    private long size;

    /**
     * hash документа
     */
    @Column(name = "hash", nullable = false)
    private String hash;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id", nullable = false)
    private Organization organization;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        License license = (License) o;
        return getId() != null && Objects.equals(getId(), license.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
