package org.example.myfirstproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.annotations.Many;

@Getter
@Setter
@Entity
public class NovelState {
    @EmbeddedId
    private NovelStateIds novelStateIds;
    @ManyToOne @JoinColumn(name = "novel_id")
    @MapsId("novelId")
    private Novel novel;
    @ManyToOne @JoinColumn(name = "state_id")
    @MapsId("stateId")
    private State state;

}
