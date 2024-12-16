package com.example.demo.play.controller.request;

import com.example.demo.game.entity.GameType;
import com.example.demo.play.service.request.PlayDiceGameRequest;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PlayDiceGameRequestForm {
    final private Long playerId;
    final private int maximumChance;
    final private GameType gameType;

    public PlayDiceGameRequest toPlayDiceGame() {
        return new PlayDiceGameRequest(
                playerId, maximumChance, gameType
        );
    }
}
