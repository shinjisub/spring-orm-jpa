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
    private long idx;

    @Column(length = 50)
    private String userName;

    @CreatedDate
    private Date createDate;

    @LastModifiedDate
    private Date updateDate;

    @ManyToOne(fetch = FetchType.LAZY)
    private Team team;

}
