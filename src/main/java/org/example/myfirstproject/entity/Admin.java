package org.example.myfirstproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(uniqueConstraints = @UniqueConstraint(
        columnNames = {"a_id"}
))
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminId;
    @Column(nullable = false, length = 30)
    private String aId;
    @Column(nullable = false, length = 200)
    private String aPw;
    @Column(nullable = false, length = 30)
    private String name;
    @Column(nullable = false, length = 11)
    private String phone;
}
