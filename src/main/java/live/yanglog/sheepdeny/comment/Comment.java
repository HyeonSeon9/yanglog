package live.yanglog.sheepdeny.comment;

import live.yanglog.sheepdeny.common.BasicEntity;
import live.yanglog.sheepdeny.member.entity.Member;
import live.yanglog.sheepdeny.post.Post;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "comment")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Comment extends BasicEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Comment parentComment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @Column
    private String content;

    @Column
    private Integer depth;

    @Column
    private Long reference;

    @Column
    private Long sequence;

}
