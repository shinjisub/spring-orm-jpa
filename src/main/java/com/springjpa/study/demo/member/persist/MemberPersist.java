package com.springjpa.study.demo.member.persist;

import com.springjpa.study.demo.member.Member;
import com.springjpa.study.demo.member.MemberJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberPersist {

    private final MemberJpaRepository memberJpaRepository;

    public List<Member> findAllList() {
        return memberJpaRepository.findAll();
    }
}
