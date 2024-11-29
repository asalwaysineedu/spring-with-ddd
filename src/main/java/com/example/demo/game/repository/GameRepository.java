package com.example.demo.game.repository;

import com.example.demo.game.entity.Game;
import com.example.demo.game.service.request.GameCreateRequest;

public interface GameRepository {
    Game create(GameCreateRequest request);
}
