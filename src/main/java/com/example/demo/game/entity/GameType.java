package com.example.demo.game.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum GameType {
    DICE("dice");

    final private String game;

    public static GameType of(String data) {
        return Arrays.stream(GameType.values())
                .filter(v -> v.getGame().equals(data))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException(String.format("[%s]는(은) 생성할 수 있는 게임이 아닙니다. 😅", data)));
    }
}
