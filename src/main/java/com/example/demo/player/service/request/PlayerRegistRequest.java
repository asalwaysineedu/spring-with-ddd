package com.example.demo.player.service.request;

import com.example.demo.player.entity.Player;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PlayerRegistRequest {
    final private String nickname;

    public Player toPlayer() {
        return new Player(nickname);
    }
}
