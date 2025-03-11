package org.example.myfirstproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.annotations.Many;

@Getter
@Setter
@Entity
public class NovelEpisode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long episodeId;
    @ManyToOne @JoinColumn(name = "novel_id")
    private Novel novel;
    @Column(nullable = false, length = 30)
    private String episodeName;
}
