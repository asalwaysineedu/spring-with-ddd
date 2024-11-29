package com.example.demo.game.repository;

import com.example.demo.game.entity.Game;
import com.example.demo.game.entity.GameType;
import com.example.demo.game.service.request.GameCreateRequest;

import java.util.List;

public interface GameRepository {
    Game create(GameCreateRequest request);
    Game getGame(GameType gameType);

    List<Game> getGameList();
}
