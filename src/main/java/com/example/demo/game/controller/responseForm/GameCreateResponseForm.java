package com.example.demo.game.controller.responseForm;

import com.example.demo.game.entity.Game;
import com.example.demo.game.entity.GameType;
import com.example.demo.game.service.response.GameCreateResponse;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class GameCreateResponseForm {
    final private Long id;
    final private GameType type;

    public static GameCreateResponseForm from(GameCreateResponse gameCreateResponse) {
        return new GameCreateResponseForm(gameCreateResponse.getId(), gameCreateResponse.getGameType());
    }
}
