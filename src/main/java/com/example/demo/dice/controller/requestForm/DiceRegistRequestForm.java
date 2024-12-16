package com.example.demo.dice.controller.requestForm;

import com.example.demo.dice.service.request.DiceRegistRequest;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class DiceRegistRequestForm {
    final private Long playerId;

    public DiceRegistRequest toDiceRegistRequest() {
        return new DiceRegistRequest(playerId);
    }
}
