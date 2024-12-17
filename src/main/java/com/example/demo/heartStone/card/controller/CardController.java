package com.example.demo.heartStone.card.controller;

import com.example.demo.heartStone.card.controller.requestForm.CardCreateRequestForm;
import com.example.demo.heartStone.card.controller.responseForm.CardCreateResponseForm;
import com.example.demo.heartStone.card.service.CardService;
import com.example.demo.heartStone.illustration.entity.Illustration;
import com.example.demo.heartStone.illustration.service.IllustrationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/card")
public class CardController {
    final private CardService cardService;
    final private IllustrationService illustrationService;

    @PostMapping("/create")
    public CardCreateResponseForm create(@RequestBody CardCreateRequestForm requestForm) {
        final Illustration illustration = illustrationService.findById(requestForm.getIllustrationId());
        return CardCreateResponseForm.from(
                cardService.create(requestForm.toCreateCardRequest(illustration)));
    }
}
