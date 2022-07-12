package com.springjpa.study.demo.order;

import com.springjpa.study.demo.item.Item;
import com.springjpa.study.demo.member.Member;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ID")
    private long id;

    @OneToMany
    @JoinColumn(name = "MEMBER_ID")
    private List<Member> memberList;

    @OneToMany
    private List<Item> items = new ArrayList<>();
    private Integer orderPrice;
    private Integer count;


}
