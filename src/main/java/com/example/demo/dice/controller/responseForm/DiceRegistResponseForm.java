package com.example.demo.dice.controller.responseForm;

import com.example.demo.dice.service.response.DiceRegistResponse;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class DiceRegistResponseForm {
    final private Long id;
    final private int number;
    final private LocalDateTime createDateTime;
    final private LocalDateTime modifyDateTime;

    public static DiceRegistResponseForm from(DiceRegistResponse rollDiceResponse) {
        return new DiceRegistResponseForm(
                rollDiceResponse.getId(),
                rollDiceResponse.getNumber(),
                rollDiceResponse.getCreateDateTime(),
                rollDiceResponse.getModifyDateTime()
        );
    }
}
