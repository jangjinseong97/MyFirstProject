package org.example.myfirstproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class MessagePic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long messagePicId;
    @ManyToOne @JoinColumn(name = "message_id")
    private Message message;
    @Column(nullable = false, length = 200)
    private String pic;
}
