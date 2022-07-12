package com.springjpa.study.demo.item;

import com.springjpa.study.demo.orderitem.OrderItem;
import lombok.*;

import javax.persistence.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ITEM_ID")
    private long id;

    @ManyToOne
    private OrderItem orderItem;

    private String name;
    private Integer price;
    private int stockQuantity;
}
