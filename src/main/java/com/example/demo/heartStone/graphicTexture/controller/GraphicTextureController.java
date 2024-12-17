package com.example.demo.heartStone.graphicTexture.controller;

import com.example.demo.heartStone.card.entity.Card;
import com.example.demo.heartStone.card.service.CardService;
import com.example.demo.heartStone.graphicTexture.controller.requestForm.GraphicTextureCreateRequestForm;
import com.example.demo.heartStone.graphicTexture.service.GraphicTextureService;
import com.example.demo.heartStone.graphicTexture.controller.responseForm.GraphicTextureCreateResponseForm;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/graphicTexture")
public class GraphicTextureController {
    final private GraphicTextureService graphicTextureService;
    final private CardService cardService;

    @PostMapping("/create")
    public GraphicTextureCreateResponseForm create(@RequestBody GraphicTextureCreateRequestForm graphicTextureCreateRequestForm) {
        final Card existCard = cardService.findById(graphicTextureCreateRequestForm.getCardId());
        return GraphicTextureCreateResponseForm.from(
                graphicTextureService.create(
                        graphicTextureCreateRequestForm.toGraphicTextureCreateRequest(existCard)));
    }
}
