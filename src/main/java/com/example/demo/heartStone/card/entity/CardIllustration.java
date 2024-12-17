package com.example.demo.heartStone.card.entity;

import com.example.demo.heartStone.illustration.entity.Illustration;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class CardIllustration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "card_id")
    private Card card;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "illustration_id")
    private Illustration illustration;

    public CardIllustration() {}

    public CardIllustration(Card card, Illustration illustration) {
        this.card = card;
        this.illustration = illustration;
    }
}
