package live.yanglog.sheepdeny.member.entity;

import live.yanglog.sheepdeny.common.entity.BasicEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * 회원 테이블
 * @author hyeonseon9
 */
@Getter
@Entity
@Table(name = "member")
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class Member extends BasicEntity{
    /**
     *  회원의 권한
     */
    public enum Role{
        ADMIN,MEMBER
    }

    /**
     *  회원의 상태
     */
    public enum State{
        ACTIVE,INACTIVE,DELETED
    }

    @Column
    private String name;

    @Column
    private String email;

    @Column(name = "last_login_at")
    private LocalDateTime lastLoginAt;

    @Column
    @Enumerated(EnumType.STRING)
    private Role role;

    @Column
    @Enumerated(EnumType.STRING)
    private State state;
}
