package live.yanglog.sheepdeny.member.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "normal_member")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class NormalMember extends Member{


    @Column
    private String password;
}
