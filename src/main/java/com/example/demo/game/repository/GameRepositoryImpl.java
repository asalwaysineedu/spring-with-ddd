package com.example.demo.game.repository;

import com.example.demo.game.entity.Game;
import com.example.demo.game.service.request.GameCreateRequest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GameRepositoryImpl implements GameRepository{
    static List<Game> games = new ArrayList<>();
    int id = 0;

    @Override
    public Game create(GameCreateRequest request) {
        final Game game = new Game((long) ++id, request.getType());
        games.add(game);
        return game;
    }
}
