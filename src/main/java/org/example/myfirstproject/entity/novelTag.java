package org.example.myfirstproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class novelTag {
    @EmbeddedId
    private novelTagIds novelTagIds;

    @ManyToOne @JoinColumn(name = "admin_id") @MapsId("admin_id")
    private Admin admin;
}
