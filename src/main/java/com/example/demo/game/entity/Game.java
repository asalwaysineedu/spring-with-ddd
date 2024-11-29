package com.example.demo.game.entity;

import lombok.Getter;

@Getter
public class Game {
    private Long id;
    private GameType type;

    public Game(Long id, GameType type) {
        this.id = id;
        this.type = type;
    }
}
