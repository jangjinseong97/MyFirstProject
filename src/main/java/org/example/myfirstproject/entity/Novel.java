package org.example.myfirstproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
public class Novel extends UpdatedAt{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long novelId;
    @ManyToOne @JoinColumn(name = "user_id")
    private User user;
    @Column(nullable = false,length = 100)
    private String title;
    @Column(length = 3000)
    private String contents;
    @Column(nullable = false,length = 200)
    private String pic;
    @Column(nullable = false, length = 5)
    private String type;
    @Column(nullable = false)
    @ColumnDefault("0")
    private int count;

}
