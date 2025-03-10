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
public class novelTagIds implements Serializable {
    private Long novelId;
    private Long adminId;
}
