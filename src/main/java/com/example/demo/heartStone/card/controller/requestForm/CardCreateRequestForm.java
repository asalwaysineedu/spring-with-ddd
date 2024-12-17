package com.example.demo.heartStone.card.controller.requestForm;

import com.example.demo.heartStone.card.entity.Placement;
import com.example.demo.heartStone.card.service.request.CardCreateRequest;
import com.example.demo.heartStone.illustration.entity.Illustration;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CardCreateRequestForm {
    final private int hp;
    final private int attackPower;
    final private String name;
    final private String skillSummery;
    final private Placement placement;
    final private Long illustrationId;

    public CardCreateRequest toCreateCardRequest(Illustration illustration) {
        return new CardCreateRequest(
                hp, attackPower, name, skillSummery, placement, illustration
        );
    }
}
