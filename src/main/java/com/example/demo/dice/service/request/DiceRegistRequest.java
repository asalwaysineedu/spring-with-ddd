package com.example.demo.dice.service.request;

import com.example.demo.dice.entity.Dice;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class DiceRegistRequest {
    final private Long playerId;

    public Dice toDice(int randomNumber) {
        return new Dice(randomNumber, playerId);
    }
}
