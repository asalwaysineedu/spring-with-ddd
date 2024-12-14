package com.example.demo.game.service;

import com.example.demo.game.entity.Game;
import com.example.demo.game.repository.GameRepository;
import com.example.demo.game.service.request.GameCreateRequest;
import com.example.demo.game.service.response.GameCreateResponse;
import com.example.demo.game.service.response.GameListResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class GameServiceImpl implements GameService{
    final private GameRepository gameRepository;

    @Override
    public GameCreateResponse create(GameCreateRequest request) {
        final Game savedGame = gameRepository.save(request.toGame());
        return GameCreateResponse.from(savedGame);
    }

    @Override
    public List<GameListResponse> list() {
        final List<Game> gameList = gameRepository.findAll();
        return gameList.stream().map(GameListResponse::from).collect(Collectors.toList());
    }
}
