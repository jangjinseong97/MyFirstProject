package org.example.myfirstproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Message extends CreatedAt{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long messageId;

    @ManyToOne @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne @JoinColumn(name = "admin_id")
    private Admin admin;
    @Column(nullable = false,length = 100)
    private String title;
    @Column(nullable = false,length = 3000)
    private String content;
    @Column(nullable = false)
    private Long targetId;
    @Column(length = 5)
    private String targetName;
    @Column(nullable = false ,length = 5)
    private String type;

}
