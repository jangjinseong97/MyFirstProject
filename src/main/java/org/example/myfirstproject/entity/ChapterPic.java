package org.example.myfirstproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ChapterPic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chapterPicId;
    @ManyToOne @JoinColumn(name = "chapter_id")
    private NovelChapter chapter;
    @Column(nullable = false, length = 100)
    private String pic;

}
