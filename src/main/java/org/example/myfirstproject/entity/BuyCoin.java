package org.example.myfirstproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class BuyCoin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long buyCoinId;
    @Column(nullable = false)
    private Integer price;
    @Column(nullable = false)
    private Integer coinNum;
}
