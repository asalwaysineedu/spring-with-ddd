package com.example.demo.game.service;

import com.example.demo.game.entity.Game;
import com.example.demo.game.service.request.GameCreateRequest;

import java.util.List;

public interface GameService {
    Game create(GameCreateRequest request);
    List<Game> getGameList();
}
