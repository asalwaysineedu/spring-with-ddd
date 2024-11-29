package com.example.demo.play.service;

import com.example.demo.dice.entity.Dice;
import com.example.demo.play.entity.Play;
import com.example.demo.play.service.request.PlayDiceGameRequest;
import com.example.demo.play.service.response.PlayDiceGameResponse;
import com.example.demo.player.entity.Player;

import java.util.List;
import java.util.Map;

public interface PlayService {
    Play diceGame(PlayDiceGameRequest request);

    String getDiceGameWinner(Long playId);
}
