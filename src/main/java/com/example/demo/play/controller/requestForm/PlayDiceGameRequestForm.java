package com.example.demo.play.controller.requestForm;

import com.example.demo.game.entity.GameType;
import com.example.demo.play.service.request.PlayDiceGameRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PlayDiceGameRequestForm {
    final private int maximumPlayer;
    final private int maximumChance;
    final private GameType gameType;

    public PlayDiceGameRequest toPlayDiceGame() {
        return new PlayDiceGameRequest(
                maximumPlayer, maximumChance, gameType
        );
    }
}
