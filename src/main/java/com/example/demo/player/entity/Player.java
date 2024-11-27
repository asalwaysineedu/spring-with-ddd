package com.example.demo.player.entity;

import lombok.Getter;

@Getter
public class Player {

    private int id;
    private String nickname;

    public Player(int id, String nickname) {
        this.id = id;
        this.nickname = nickname;
    }
}
