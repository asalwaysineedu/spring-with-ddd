package com.example.demo.heartStone.card.service.response;

import com.example.demo.heartStone.card.entity.Card;
import com.example.demo.heartStone.card.entity.CardIllustration;
import com.example.demo.heartStone.card.entity.Placement;
import com.example.demo.heartStone.illustration.entity.Illustration;
import com.example.demo.heartStone.illustration.service.response.IllustrationCreateResponse;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CardCreateResponse {
    final private Long cardId;
    final private int cardHp;
    final private int cardAttackPower;
    final private String cardName;
    final private String cardSkillSummery;
    final private Placement cardPlacement;
    final private IllustrationCreateResponse illustrationCreateResponse;

    public static CardCreateResponse from(CardIllustration cardIllustration) {
        return new CardCreateResponse(
                cardIllustration.getCard().getId(),
                cardIllustration.getCard().getHp(),
                cardIllustration.getCard().getAttackPower(),
                cardIllustration.getCard().getName(),
                cardIllustration.getCard().getSkillSummery(),
                cardIllustration.getCard().getPlacement(),
                IllustrationCreateResponse.from(cardIllustration.getIllustration())
        );
    }
}
