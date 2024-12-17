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
    public CardCreateResponse create(CardCreateRequest request) {
        final Card savedCard = cardRepository.save(request.toCard());
        final CardIllustration savedCardIllustration = cardIllustrationRepository.save(request.toCardIllustration(savedCard));
        return CardCreateResponse.from(savedCardIllustration);
    }
}
