package com.example.demo.heartStone.card.service.request;

import com.example.demo.heartStone.card.entity.Card;
import com.example.demo.heartStone.card.entity.CardIllustration;
import com.example.demo.heartStone.card.entity.Placement;
import com.example.demo.heartStone.illustration.entity.Illustration;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CardCreateRequest {
    final private int hp;
    final private int attackPower;
    final private String name;
    final private String skillSummery;
    final private Placement placement;
    final private Illustration illustration;

    public Card toCard() {
        return new Card(hp, attackPower, name, skillSummery, placement);
    }

    public CardIllustration toCardIllustration(Card card) {
        return new CardIllustration(card, illustration);
    }
}
