package com.example.demo.game.entity;

import com.example.demo.common.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Game extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private GameType type;

    public Game(GameType type) {
        this.type = type;
    }

    public Game() {}
}
