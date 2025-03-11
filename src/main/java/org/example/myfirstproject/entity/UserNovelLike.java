package org.example.myfirstproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class UserNovelLike {
    @EmbeddedId
    private UserNovelLikeIds userNovelLikeIds;
    @ManyToOne
    @JoinColumn(name = "user_id")
    @MapsId("userId")
    private User user;
    @ManyToOne @JoinColumn(name = "novel_id")
    @MapsId("novelId")
    private Novel novel;

}
