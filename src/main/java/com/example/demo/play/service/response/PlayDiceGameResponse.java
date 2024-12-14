package com.example.demo.play.service.response;

import com.example.demo.dice.entity.Dice;
import com.example.demo.dice.service.response.DiceRegistResponse;
import com.example.demo.play.entity.Play;
import com.example.demo.player.entity.Player;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class PlayDiceGameResponse {
    final private Long playId;
    final private String playerNickname;
    final private List<DiceRegistResponse> diceList;

    public static PlayDiceGameResponse from(Play play, Player player, List<DiceRegistResponse> diceList) {
        return new PlayDiceGameResponse(
                play.getId(),
                player.getNickname(),
                diceList
        );
    }
}
