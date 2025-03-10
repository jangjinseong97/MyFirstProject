package org.example.myfirstproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Novel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long novelId;
    @ManyToOne @JoinColumn(name = "user_id")
    private User user;
    @Column(nullable = false,length = 100)
    private String title;
    @Column(length = 3000)
    private String contents;
    @Column(nullable = false,length = 200)
    private String pic;

}
