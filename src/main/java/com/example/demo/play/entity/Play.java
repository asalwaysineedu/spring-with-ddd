package com.example.demo.play.entity;

import com.example.demo.game.entity.Game;
import com.example.demo.play.service.response.PlayDiceGameResponse;
import lombok.Getter;

import java.util.List;

@Getter
public class Play {
    private Long id;
    private Game game;
    private List<PlayDiceGameResponse> result;

    public Play(Long id, Game game, List<PlayDiceGameResponse> result) {
        this.id = id;
        this.game = game;
        this.result = result;
    }
}
