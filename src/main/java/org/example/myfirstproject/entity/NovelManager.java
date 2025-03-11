package org.example.myfirstproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class NovelManager {
    @EmbeddedId
    private NovelManagerIds novelManagerIds;
    @ManyToOne @JoinColumn(name = "novel_id")
    @MapsId("novelId")
    private Novel novel;
    @ManyToOne @JoinColumn(name = "admin_id")
    @MapsId("adminId")
    private Admin admin;
}
