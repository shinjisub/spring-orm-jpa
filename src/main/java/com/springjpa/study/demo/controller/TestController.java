package com.springjpa.study.demo.controller;

import com.springjpa.study.demo.member.Member;
import com.springjpa.study.demo.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final MemberService memberService;

    @GetMapping("/")
    public void test() {
        List<Member> allList = memberService.findAllList();

        for (Member member : allList) {
            System.out.println("사용자명 = " + member.getUserName());
            System.out.println("팀명 = " + member.getTeam().getTeamId());
            System.out.println("팀명 = " + member.getTeam().getTeamName());
        }
    }
}
