package org.example.myfirstproject.entity;

import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
@EqualsAndHashCode
public class UserChapterLikeIds {
    private Long userId;
    private Long chapterId;
}
