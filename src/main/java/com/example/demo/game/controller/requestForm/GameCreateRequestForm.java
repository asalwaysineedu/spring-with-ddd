package com.example.demo.game.controller.requestForm;

import com.example.demo.game.entity.GameType;
import com.example.demo.game.service.request.GameCreateRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GameCreateRequestForm {
    private GameType type;

    public GameCreateRequest toGameCreateRequest() {
        return new GameCreateRequest(type);
    }
}
