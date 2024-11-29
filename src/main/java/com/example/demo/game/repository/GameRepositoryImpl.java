package com.example.demo.game.repository;

import com.example.demo.game.entity.Game;
import com.example.demo.game.entity.GameType;
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

    @Override
    public Game getGame(GameType gameType) {
        return games.stream()
                .filter(g -> g.getType().equals(gameType))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(String.format("%s은(는) 아직 생성되기 전 입니다. 생성해 주세요. 😊", gameType)));
    }

    @Override
    public List<Game> getGameList() {
        if (games.isEmpty()) throw new IllegalArgumentException("생성된 게임이 없습니다. 😅");
        return games;
    }
}
