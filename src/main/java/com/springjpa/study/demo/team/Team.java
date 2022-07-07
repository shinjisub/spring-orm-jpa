package com.springjpa.study.demo.team;

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
public class Team {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long teamId;

    @Column(length = 50)
    private String teamName;

    @CreatedDate
    private Date createDate;

    @LastModifiedDate
    private Date updateDate;

}
