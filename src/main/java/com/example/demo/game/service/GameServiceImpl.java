package com.example.demo.game.service;

import com.example.demo.game.entity.Game;
import com.example.demo.game.repository.GameRepository;
import com.example.demo.game.service.request.GameCreateRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class GameServiceImpl implements GameService{
    final private GameRepository gameRepository;

    @Override
    public Game create(GameCreateRequest request) {
        return gameRepository.create(request);
    }
}
