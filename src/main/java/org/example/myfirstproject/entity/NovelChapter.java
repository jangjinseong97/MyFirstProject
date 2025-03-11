package org.example.myfirstproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class NovelChapter extends UpdatedAt{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chapterId;
    @ManyToOne @JoinColumn(name = "episode_id")
    private NovelEpisode episode;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String contents;
    @Column(nullable = false, length = 5)
    private String type;
    @Column(nullable = false, columnDefinition = "DATETIME(0)")
    private LocalDateTime uploadAt;
    @Column(nullable = false)
    @ColumnDefault("0")
    private int count;
}
