package com.example.demo.play.service.response;

import com.example.demo.dice.entity.Dice;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class PlayDiceGameResponse {
    final private String player;
    final private List<Dice> diceList;
}
