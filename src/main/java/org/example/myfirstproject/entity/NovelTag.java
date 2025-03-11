package org.example.myfirstproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class NovelTag {
    @EmbeddedId
    private NovelTagIds novelTagIds;

    @ManyToOne @JoinColumn(name = "admin_id") @MapsId("admin_id")
    private Admin admin;
    @ManyToOne @JoinColumn(name = "novel_id") @MapsId("novel_id")
    private Novel novel;

}
