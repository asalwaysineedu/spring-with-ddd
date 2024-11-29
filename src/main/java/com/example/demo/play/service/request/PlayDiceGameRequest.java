package com.example.demo.play.service.request;

import com.example.demo.game.entity.GameType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PlayDiceGameRequest {
    final private int maximumPlayer;
    final private int maximumChance;
    final private GameType gameType;
}
