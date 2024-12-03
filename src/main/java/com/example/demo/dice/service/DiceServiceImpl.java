package com.example.demo.dice.service;

import com.example.demo.dice.entity.Dice;
import com.example.demo.dice.repository.DiceRepository;
import com.example.demo.dice.service.request.DiceRegistRequest;
import com.example.demo.dice.service.response.DiceRegistResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

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
}