package live.yanglog.sheepdeny.common.entity;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 *  엔티티에 공통으로 들어가는 컬럼
 * @author hyeonseon9
 */

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BasicEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;
}
