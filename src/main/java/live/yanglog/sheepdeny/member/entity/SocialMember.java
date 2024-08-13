package live.yanglog.sheepdeny.member.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "social_member")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SocialMember extends Member{
    @Column(name = "social_type")
    private String socialType;
}
