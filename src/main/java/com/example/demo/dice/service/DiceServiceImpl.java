package com.example.demo.dice.service;

import com.example.demo.dice.entity.Dice;
import com.example.demo.dice.repository.DiceRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class DiceServiceImpl implements DiceService{
    final private DiceRepository diceRepository;

    @Override
    public Dice rollDice() {
        return diceRepository.rollDice();
    }

    @Override
    public List<Dice> rollDiceWithMaximumChance(int chance) {
        List<Dice> rollDiceResultList = new ArrayList<>();
        for (int i = 0; i < chance; i++) {
            rollDiceResultList.add(rollDice());
        }
        return rollDiceResultList;
    }
}
