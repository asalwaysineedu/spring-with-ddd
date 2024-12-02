package com.example.demo.game.service;

import com.example.demo.game.entity.Game;
import com.example.demo.game.service.request.GameCreateRequest;
import com.example.demo.game.service.response.GameCreateResponse;

public interface GameService {
    GameCreateResponse create(GameCreateRequest request);
}
