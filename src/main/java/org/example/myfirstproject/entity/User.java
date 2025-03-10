package org.example.myfirstproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(
        uniqueConstraints ={
            @UniqueConstraint(
                    columnNames = {"email"}
            )
        }
)
public class User extends UpdatedAt{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private Long userId;
    @Column(nullable = false, length = 30) private String name;
    @Column(length = 20) private String nickName;
    @Column(length = 30, nullable = false) private String email;
    @Column(length = 200, nullable = false) private String pw;
    @ColumnDefault("0") private Integer coin;
    @Column private UserType userType;
    @Column(nullable = false) private LocalDate birthday;


}
