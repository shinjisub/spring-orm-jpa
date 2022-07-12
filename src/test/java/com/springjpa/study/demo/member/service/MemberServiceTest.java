package com.springjpa.study.demo.member.service;

import com.springjpa.study.demo.member.Member;
import com.springjpa.study.demo.member.MemberJpaRepository;
import com.springjpa.study.demo.team.Team;
import com.springjpa.study.demo.team.TeamJpaRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberServiceTest {

    @Autowired
    private MemberService memberService;
    @Autowired
    private MemberJpaRepository memberJpaRepository;

    @Autowired
    private TeamJpaRepository teamJpaRepository;


    @Test
    public void memberSave() {
        Team team1 = teamJpaRepository.save(
            Team.builder()
                .name("팀1")
            .build()
        );

        Member member1 = memberJpaRepository.save(
                Member.builder()
                        .userName("멤버1")
                        .team(team1)
                        .build()
        );

        team1.getMembers().add(member1);
    }


    @Test
    public void memberRemove() {
        Team team = teamJpaRepository.findById(2L).get();
        Member member = memberJpaRepository.findById(1L).get();

        member.setTeam(team);
        Member member1 = memberJpaRepository.findById(1L).get();
        System.out.println("member1.getTeam() = " + member1.getTeam());
    }

}