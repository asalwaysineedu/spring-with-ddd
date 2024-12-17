package com.example.demo.heartStone.graphicTexture.service.request;

import com.example.demo.heartStone.card.entity.Card;
import com.example.demo.heartStone.graphicTexture.entity.GraphicTexture;
import com.example.demo.heartStone.graphicTexture.entity.GraphicTextureOfCard;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class GraphicTextureCreateRequest {
    final private String name;
    final private int positionX;
    final private int positionY;
    final private Card card;

    public GraphicTexture toGraphicTexture() {
        return new GraphicTexture(name, positionX, positionY);
    }

    public GraphicTextureOfCard toGraphicTextureOfCard(GraphicTexture graphicTexture) {
        return new GraphicTextureOfCard(card, graphicTexture);
    }
}
