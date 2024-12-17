package com.example.demo.heartStone.graphicTexture.entity;

import com.example.demo.heartStone.card.entity.Card;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class GraphicTextureOfCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "card_id")
    private Card card;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "graphic_texture_id")
    private GraphicTexture graphicTexture;

    public GraphicTextureOfCard() {}

    public GraphicTextureOfCard(Card card, GraphicTexture graphicTexture) {
        this.card = card;
        this.graphicTexture = graphicTexture;
    }
}
