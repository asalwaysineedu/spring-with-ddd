package com.example.demo.player.entity;

import lombok.Getter;

@Getter
public class Player {

    private Long id;
    private String nickname;

    public Player(Long id, String nickname) {
        this.id = id;
        this.nickname = nickname;
    }
}
