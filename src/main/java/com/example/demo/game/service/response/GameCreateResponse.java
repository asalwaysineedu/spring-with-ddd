package com.example.demo.game.service.response;

import com.example.demo.game.entity.Game;
import com.example.demo.game.entity.GameType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class GameCreateResponse {
    final private Long id;
    final private GameType gameType;

    public static GameCreateResponse from(Game game) {
        return new GameCreateResponse(game.getId(), game.getType());
    }
}
