package com.example.demo.dice.service;

import com.example.demo.dice.service.request.DiceRegistRequest;
import com.example.demo.dice.service.response.DiceRegistResponse;

public interface DiceService {
    DiceRegistResponse rollDice(DiceRegistRequest request);
}
