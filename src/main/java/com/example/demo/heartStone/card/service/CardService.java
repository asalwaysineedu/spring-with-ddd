package com.example.demo.heartStone.card.service;

import com.example.demo.heartStone.card.entity.Card;
import com.example.demo.heartStone.card.service.request.CardCreateRequest;
import com.example.demo.heartStone.card.service.response.CardCreateResponse;

public interface CardService {

    CardCreateResponse create(CardCreateRequest createCardRequest);

}
