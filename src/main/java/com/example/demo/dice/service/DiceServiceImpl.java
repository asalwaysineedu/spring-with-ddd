package com.example.demo.dice.service;

import com.example.demo.dice.entity.Dice;
import com.example.demo.dice.repository.DiceRepository;
import com.example.demo.dice.service.request.DiceRegistRequest;
import com.example.demo.dice.service.response.DiceRegistResponse;
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
    public DiceRegistResponse rollDice(DiceRegistRequest request) {
        final int MIN = 1;
        final int MAX = 6;
        final int randomNumber = (int) (Math.random() * MAX) + MIN;
        final Dice savedDice = diceRepository.save(request.toDice(randomNumber));

        return DiceRegistResponse.from(savedDice);
    }

    @Override
    public List<DiceRegistResponse> rollDiceWithMaximumChance(int maximumChance, Long playerId) {
        List<DiceRegistResponse> diceRegistResponseList = new ArrayList<>();
        for (int i = 0; i < maximumChance; i++) {
            diceRegistResponseList.add(
                    rollDice(new DiceRegistRequest(playerId)));
        }
        return diceRegistResponseList;
    }
}