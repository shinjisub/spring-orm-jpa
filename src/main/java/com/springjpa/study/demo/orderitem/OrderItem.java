package com.springjpa.study.demo.orderitem;

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
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDERITEM_ID")
    private long id;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    @OneToMany
    private List<Item> items = new ArrayList<>();
    private Integer orderPrice;
    private Integer count;
}
