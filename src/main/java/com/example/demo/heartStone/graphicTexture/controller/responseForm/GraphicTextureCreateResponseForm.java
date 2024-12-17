package com.example.demo.heartStone.graphicTexture.controller.responseForm;

import com.example.demo.heartStone.graphicTexture.service.response.GraphicTextureCreateResponse;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class GraphicTextureCreateResponseForm {
    final private Long graphicTextureId;
    final private String graphicTextureName;
    final private int graphicTexturePositionX;
    final private int graphicTexturePositionY;

    public static GraphicTextureCreateResponseForm from(GraphicTextureCreateResponse graphicTextureCreateResponse) {
        return new GraphicTextureCreateResponseForm(
                graphicTextureCreateResponse.getGraphicTextureId(),
                graphicTextureCreateResponse.getGraphicTextureName(),
                graphicTextureCreateResponse.getGraphicTexturePositionX(),
                graphicTextureCreateResponse.getGraphicTexturePositionY()
        );
    }
}
