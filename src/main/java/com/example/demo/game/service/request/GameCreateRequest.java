package com.example.demo.game.service.request;

import com.example.demo.game.entity.GameType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GameCreateRequest {
    final private GameType type;
}
