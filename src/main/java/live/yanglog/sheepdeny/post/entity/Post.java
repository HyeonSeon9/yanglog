package live.yanglog.sheepdeny.post.entity;

import live.yanglog.sheepdeny.blog.entity.Blog;
import live.yanglog.sheepdeny.common.entity.BasicEntity;
import live.yanglog.sheepdeny.member.entity.Member;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "post")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Post extends BasicEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "blog_id")
    private Blog blog;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @Column
    private String title;

    @Column
    private String content;

    @Column(name = "is_public")
    private Boolean isPublic;
}
