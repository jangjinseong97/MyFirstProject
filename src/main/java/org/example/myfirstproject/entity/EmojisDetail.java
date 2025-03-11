package org.example.myfirstproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class EmojisDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long EmojisDetailId;
    @ManyToOne @JoinColumn(name = "emojis_id")
    private Emojis emojis;
    @Column(nullable = false, length = 200)
    private String pic;
    @Column(nullable = false, length = 30)
    private String name;
}
