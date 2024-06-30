package academy.kata.mis.repository_test.model.entity;

import academy.kata.mis.repository_test.model.enums.DocumentType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

/**
 * Рентген снимок
 */
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "x_rays")
public class XRay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * время и дата снимка
     */
    @Column(name = "time", nullable = false)
    private LocalDateTime time;

    /**
     * тип документа
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private DocumentType type;

    /**
     * идентификатор документа в сервисе-хранилище документов
     */
    @Column(name = "document_id", nullable = false)
    private UUID documentId;

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

    /**
     * связь с обращением по заболеванию
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "appeal_id", nullable = false)
    private Appeal appeal;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        XRay xRay = (XRay) o;
        return getId() != null && Objects.equals(getId(), xRay.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
