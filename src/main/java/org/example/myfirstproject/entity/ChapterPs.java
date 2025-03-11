package org.example.myfirstproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ChapterPs {
    @Id
    @OneToOne @JoinColumn(name = "chapter_id")
    private NovelChapter novelChapter;
    @Column(nullable = false, length = 1000)
    private String contents;
    @Column(nullable = false, length = 100)
    private String pic;
}
