package com.example.demo.play.controller.request;

import com.example.demo.play.service.request.PlayDiceGameWinnerRequest;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class PlayDiceGameWinnerRequestForm {
    final private List<Long> playIdList;

    public PlayDiceGameWinnerRequest toGetDiceGameWinner() {
        return new PlayDiceGameWinnerRequest(playIdList);
    }
}
