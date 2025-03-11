package org.example.myfirstproject.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class NovelStateIds implements Serializable {
    private Long novelId;
    private Long stateId;
}
