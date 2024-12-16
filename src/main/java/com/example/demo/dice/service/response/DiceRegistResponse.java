package com.example.demo.dice.service.response;

import com.example.demo.dice.entity.Dice;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class DiceRegistResponse {
    final private Long id;
    final private Integer number;
    final private LocalDateTime createDateTime;
    final private LocalDateTime modifyDateTime;

    public static DiceRegistResponse from(Dice dice) {
        return new DiceRegistResponse(dice.getId(), dice.getNumber(), dice.getCreateDateTime(), dice.getModifyDateTime());
    }
}
