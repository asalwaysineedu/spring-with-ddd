package com.example.demo.game.service;

import com.example.demo.game.service.request.GameCreateRequest;
import com.example.demo.game.service.response.GameCreateResponse;
import com.example.demo.game.service.response.GameListResponse;

import java.util.List;

public interface GameService {
    GameCreateResponse create(GameCreateRequest request);
    List<GameListResponse> list();
}
