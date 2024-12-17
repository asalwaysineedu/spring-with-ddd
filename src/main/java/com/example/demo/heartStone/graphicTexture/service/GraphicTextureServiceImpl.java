package com.example.demo.heartStone.graphicTexture.service;

import com.example.demo.heartStone.graphicTexture.entity.GraphicTexture;
import com.example.demo.heartStone.graphicTexture.entity.GraphicTextureOfCard;
import com.example.demo.heartStone.graphicTexture.repository.GraphicTextureOfCardRepository;
import com.example.demo.heartStone.graphicTexture.repository.GraphicTextureRepository;
import com.example.demo.heartStone.graphicTexture.service.request.GraphicTextureCreateRequest;
import com.example.demo.heartStone.graphicTexture.service.response.GraphicTextureCreateResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class GraphicTextureServiceImpl implements GraphicTextureService {
    final private GraphicTextureRepository graphicTextureRepository;
    final private GraphicTextureOfCardRepository graphicTextureOfCardRepository;

    @Override
    public GraphicTextureCreateResponse create(GraphicTextureCreateRequest graphicTextureCreateRequest) {
        final GraphicTexture savedGraphicTexture = graphicTextureRepository.save(graphicTextureCreateRequest.toGraphicTexture());
        graphicTextureOfCardRepository.save(graphicTextureCreateRequest.toGraphicTextureOfCard(savedGraphicTexture));
        return GraphicTextureCreateResponse.from(savedGraphicTexture);
    }
}
