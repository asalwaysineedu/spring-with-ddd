package com.example.demo.game.service.response;

import com.example.demo.game.entity.Game;
import com.example.demo.game.entity.GameType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class GameListResponse {
    final private Long id;
    final private GameType gameType;
    final private LocalDateTime createDateTime;
    final private LocalDateTime modifyDateTime;

    public static GameListResponse from(Game game) {
        return new GameListResponse(
                game.getId(),
                game.getType(),
                game.getCreateDateTime(),
                game.getModifyDateTime()
        );
    }
}
