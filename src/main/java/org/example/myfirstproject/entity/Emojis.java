package org.example.myfirstproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Emojis extends UpdatedAt{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emojisId;
    @ManyToOne @JoinColumn(name = "novel_id")
    private Novel novel;
    @Column(nullable = false, length = 30)
    private String name;
    @Column(nullable = false)
    private int coin;
    @Column(nullable = false, length = 5)
    private String type;
}
