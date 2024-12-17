package com.example.demo.heartStone.graphicTexture.service;

import com.example.demo.heartStone.graphicTexture.service.request.GraphicTextureCreateRequest;
import com.example.demo.heartStone.graphicTexture.service.response.GraphicTextureCreateResponse;

public interface GraphicTextureService {
    GraphicTextureCreateResponse create(GraphicTextureCreateRequest graphicTextureCreateRequest);
}
