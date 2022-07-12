package com.springjpa.study.demo.member;


import com.springjpa.study.demo.team.Team;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 50)
    private String userName;

    @ManyToOne
    @JoinColumn(name = "teamId")
    private Team team;

    // 양방향의 경우 Member, Team 쪽 모두 변경해줘야한다.
    public void setTeam(Team team) {
        this.team = team;
        team.getMembers().add(this);
    }
}
