package live.yanglog.sheepdeny.blog.entity;

import live.yanglog.sheepdeny.common.entity.BasicEntity;
import live.yanglog.sheepdeny.member.entity.Member;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "blog")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Blog extends BasicEntity {

    @Column
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

}
