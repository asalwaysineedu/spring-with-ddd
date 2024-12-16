package com.example.demo.play.service;

import com.example.demo.play.controller.request.PlayDiceGameWinnerRequestForm;
import com.example.demo.play.entity.Play;
import com.example.demo.play.service.request.PlayDiceGameRequest;
import com.example.demo.play.service.request.PlayDiceGameWinnerRequest;
import com.example.demo.play.service.response.PlayDiceGameResponse;

import java.util.List;

public interface PlayService {
    PlayDiceGameResponse playDiceGame(PlayDiceGameRequest playDiceGame);

    List<Play> list();

    String getDiceGameWinner(PlayDiceGameWinnerRequest playDiceGameWinnerRequest);
}
