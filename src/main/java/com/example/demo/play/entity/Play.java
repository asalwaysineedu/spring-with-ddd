package com.example.demo.play.entity;

import com.example.demo.common.BaseTimeEntity;
import com.example.demo.game.entity.GameType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

import java.util.List;

@Entity
@Getter
public class Play extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private GameType gameType;

    private Long playerId;
    private List<Long> diceIdList;

    public Play(GameType gameType, Long playerId, List<Long> diceIdList) {
        this.gameType = gameType;
        this.playerId = playerId;
        this.diceIdList = diceIdList;
    }

    public Play() {
    }
}
