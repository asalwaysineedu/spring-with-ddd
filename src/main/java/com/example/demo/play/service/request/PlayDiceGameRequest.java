package com.example.demo.play.service.request;

import com.example.demo.game.entity.GameType;
import com.example.demo.play.entity.Play;
import com.example.demo.player.entity.Player;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class PlayDiceGameRequest {
    final private Long playerId;
    final private int maximumChance;
    final private GameType gameType;

    public Play toPlay(Player savedPlayer, List<Long> diceIdList) {
        return new Play(gameType, savedPlayer.getId(), diceIdList);
    }
}
