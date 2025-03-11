package org.example.myfirstproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class NoticePic {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long noticePicId;
    @ManyToOne @JoinColumn(name = "notice_id")
    private Notice notice;
    @Column(nullable = false, length = 200)
    private String pic;
}
