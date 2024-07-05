package academy.kata.mis.structureservice.model;

import academy.kata.mis.structureservice.enums.DocumentType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "documents")
public class Document {

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
    @JoinColumn(name = "position_id", nullable = false)
    private Position position;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Document document = (Document) o;
        return getId() != null && Objects.equals(getId(), document.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
