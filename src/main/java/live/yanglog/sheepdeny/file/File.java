package live.yanglog.sheepdeny.file;

import live.yanglog.sheepdeny.common.BasicEntity;
import live.yanglog.sheepdeny.post.Post;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "file")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class File extends BasicEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

    @Column
    private String path;

    @Column
    private String name;

    @Column
    private Long size;

    @Column
    private String type;
}

