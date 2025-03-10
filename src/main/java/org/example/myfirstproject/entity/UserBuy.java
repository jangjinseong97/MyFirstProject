package org.example.myfirstproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserBuy extends CreatedAt{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userBuyId;

    @ManyToOne @JoinColumn(name = "user_Id")
    private User user;

    @ManyToOne @JoinColumn(name = "buy_coin_id")
    private BuyCoin buyCoin;
    @Column(nullable = false,length = 100)
    private String tid;

}
