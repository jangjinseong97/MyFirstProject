package org.example.myfirstproject.entity;

import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
@EqualsAndHashCode
public class UserNovelLikeIds implements Serializable {
    private Long userId;
    private Long novelId;
}
