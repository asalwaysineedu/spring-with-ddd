package com.example.demo.heartStone.card.service;

import com.example.demo.heartStone.card.entity.Card;
import com.example.demo.heartStone.card.entity.CardIllustration;
import com.example.demo.heartStone.card.repository.CardIllustrationRepository;
import com.example.demo.heartStone.card.repository.CardRepository;
import com.example.demo.heartStone.card.service.request.CardCreateRequest;
import com.example.demo.heartStone.card.service.response.CardCreateResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {
    final private CardRepository cardRepository;
    final private CardIllustrationRepository cardIllustrationRepository;

    @Override
    public Card findById(Long cardId) {
        return cardRepository.findById(cardId).orElseThrow(() -> new IllegalArgumentException("존재하는 카드가 아닙니다."));
    }

    @Override
    public CardCreateResponse create(CardCreateRequest request) {
        final Card savedCard = cardRepository.save(request.toCard());
        final CardIllustration savedCardIllustration = cardIllustrationRepository.save(request.toCardIllustration(savedCard));
        return CardCreateResponse.from(savedCardIllustration);
    }
}
