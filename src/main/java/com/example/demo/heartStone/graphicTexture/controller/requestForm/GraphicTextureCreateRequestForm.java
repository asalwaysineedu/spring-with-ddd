package com.example.demo.heartStone.graphicTexture.controller.requestForm;

import com.example.demo.heartStone.card.entity.Card;
import com.example.demo.heartStone.graphicTexture.service.request.GraphicTextureCreateRequest;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class GraphicTextureCreateRequestForm {
    final private Long cardId;
    final private String graphicTextureName;
    final private int graphicTexturePositionX;
    final private int graphicTexturePositionY;

    public GraphicTextureCreateRequest toGraphicTextureCreateRequest(Card card) {
        return new GraphicTextureCreateRequest(
                graphicTextureName, graphicTexturePositionX, graphicTexturePositionY, card
        );
    }
}
