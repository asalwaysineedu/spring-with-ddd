package com.example.demo.heartStone.graphicTexture.service.response;

import com.example.demo.heartStone.graphicTexture.entity.GraphicTexture;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class GraphicTextureCreateResponse {
    final private Long graphicTextureId;
    final private String graphicTextureName;
    final private int graphicTexturePositionX;
    final private int graphicTexturePositionY;

    public static GraphicTextureCreateResponse from(GraphicTexture graphicTexture) {
        return new GraphicTextureCreateResponse(
                graphicTexture.getId(),
                graphicTexture.getName(),
                graphicTexture.getPositionX(),
                graphicTexture.getPositionY()
        );
    }
}
