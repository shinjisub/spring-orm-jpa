package com.springjpa.study.demo.member.service;

import com.springjpa.study.demo.member.Member;
import com.springjpa.study.demo.member.persist.MemberPersist;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberPersist memberPersist;

    public List<Member> findAllList() {
        return memberPersist.findAllList();
    }
}
