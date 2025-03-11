package org.example.myfirstproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Notice extends UpdatedAt{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long NoticeId;
    @ManyToOne @JoinColumn(name = "novel_id")
    private Novel novel;
    @Column(nullable = false, length = 30)
    private String title;
    @Column(nullable = false, length = 3000)
    private String content;
}
