package com.example.demo.dice.service.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class DiceListResponse {
    final private Long id;
    final private Long playerId;
    final private int number;
}
