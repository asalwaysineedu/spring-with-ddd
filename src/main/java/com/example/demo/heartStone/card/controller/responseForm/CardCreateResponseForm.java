package com.example.demo.heartStone.card.controller.responseForm;

import com.example.demo.heartStone.card.entity.Placement;
import com.example.demo.heartStone.card.service.response.CardCreateResponse;
import com.example.demo.heartStone.illustration.controller.responseForm.IllustrationCreateResponseForm;
import com.example.demo.heartStone.illustration.service.response.IllustrationCreateResponse;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CardCreateResponseForm {
    final private int hp;
    final private int attackPower;
    final private String name;
    final private String skillSummery;
    final private Placement placement;
    final private IllustrationCreateResponseForm illustration;

    public static CardCreateResponseForm from(CardCreateResponse cardCreateResponse) {
        return new CardCreateResponseForm(
                cardCreateResponse.getCardHp(),
                cardCreateResponse.getCardAttackPower(),
                cardCreateResponse.getCardName(),
                cardCreateResponse.getCardSkillSummery(),
                cardCreateResponse.getCardPlacement(),
                IllustrationCreateResponseForm.from(
                        cardCreateResponse.getIllustrationCreateResponse())
        );
    }
}
