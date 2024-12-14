package com.example.demo.play.controller.response;

import com.example.demo.dice.service.response.DiceRegistResponse;
import com.example.demo.play.service.response.PlayDiceGameResponse;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class PlayDiceGameResponseForm {
    final private Long playId;
    final private String playerNickname;
    final private List<DiceRegistResponse> diceList;

    public static PlayDiceGameResponseForm from(PlayDiceGameResponse playDiceGameResponse) {
        return new PlayDiceGameResponseForm(
                playDiceGameResponse.getPlayId(),
                playDiceGameResponse.getPlayerNickname(),
                playDiceGameResponse.getDiceList()
        );
    }
}
