package org.example.myfirstproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class UserChapterLike {
    @EmbeddedId
    private UserChapterLikeIds userChapterLikeIds;
    @ManyToOne @JoinColumn(name = "user_id")
    @MapsId("userId")
    private User user;
    @ManyToOne @JoinColumn(name = "chapter_id")
    @MapsId("chapterId")
    private NovelChapter novelChapter;
}
