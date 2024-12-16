package com.example.demo.dice.service;

import com.example.demo.dice.entity.Dice;
import com.example.demo.dice.service.request.DiceRegistRequest;
import com.example.demo.dice.service.response.DiceRegistResponse;

import java.util.List;

public interface DiceService {
    DiceRegistResponse rollDice(DiceRegistRequest request);
    List<DiceRegistResponse> rollDiceWithMaximumChance(int maximumChance, Long playerId);
}
