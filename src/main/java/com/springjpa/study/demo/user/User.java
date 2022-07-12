package com.springjpa.study.demo.user;

import com.springjpa.study.demo.order.Order;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_ID")
    private long id;
    private String name;
    private String city;
    private String street;
    private String zipcode;

    @OneToMany
    private List<Order> orderList = new ArrayList<>();
}
