package com.example.demo.game.service.request;

import com.example.demo.game.entity.Game;
import com.example.demo.game.entity.GameType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GameCreateRequest {
    final private GameType type;

    public Game toGame() {
        return new Game(type);
    }
}
