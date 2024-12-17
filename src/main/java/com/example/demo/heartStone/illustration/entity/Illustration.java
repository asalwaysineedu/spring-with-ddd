package com.example.demo.heartStone.illustration.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Illustration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "varchar(100)")
    private IllustrationFrame frame;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "varchar(100)")
    private IllustrationImage image;

    public Illustration() {}

    public Illustration(IllustrationFrame illustrationFrame, IllustrationImage illustrationImage) {
        this.frame = illustrationFrame;
        this.image = illustrationImage;
    }
}
