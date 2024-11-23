package com.example.demo.dice.service;

import com.example.demo.dice.repository.DiceRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class DiceServiceImpl implements DiceService{
    final private DiceRepository diceRepository;

    @Override
    public Integer rollDice() {
        return null;
    }
}
