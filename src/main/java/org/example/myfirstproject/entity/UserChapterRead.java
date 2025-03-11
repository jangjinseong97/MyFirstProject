package org.example.myfirstproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
public class UserChapterRead extends UpdatedAt{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long readId;
    @ManyToOne @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne @JoinColumn(name = "chapter_id")
    private NovelChapter chapter;
    @Column(nullable = false)
    private Long novel_id; // 검색용
    @Column(nullable = false) @ColumnDefault("1")
    private int count; // 몇번이나 읽었는지(같은회차 기준으로)
}
