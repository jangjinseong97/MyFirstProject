package org.example.myfirstproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CommonCode extends UpdatedAt{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeId;
    @Column(nullable = false, length = 30)
    private String codeName;
    @Column(nullable = false, length = 3)
    private String tableCode;
    @Column(nullable = false, length = 5)
    private String typeCode;

}
