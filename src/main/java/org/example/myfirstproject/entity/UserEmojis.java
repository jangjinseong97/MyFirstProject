package org.example.myfirstproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class UserEmojis extends CreatedAt{
    @EmbeddedId
    private UserEmojisIds userEmojisIds;

    @ManyToOne @JoinColumn(name = "user_id")
    @MapsId("userId")
    private User user;
    @ManyToOne @JoinColumn(name = "emojis_id")
    @MapsId("emojisId")
    private Emojis emojis;
}
