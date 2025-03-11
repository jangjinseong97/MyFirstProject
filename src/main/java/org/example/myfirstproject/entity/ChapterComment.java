package org.example.myfirstproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ChapterComment extends CreatedAt{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chapterCommentId;
    @ManyToOne @JoinColumn(name = "read_id")
    private UserChapterRead read;
    @Column(length = 1000)
    private String comment;
    @Column(length = 100)
    private String pic;
    @Column(nullable = false, length = 5)
    private String type;

}
