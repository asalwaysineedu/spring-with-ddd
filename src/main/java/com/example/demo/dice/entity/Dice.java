package com.example.demo.dice.entity;

import com.example.demo.common.BaseTimeEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Dice extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long playerId;
    private int number;

    public Dice(int number, Long playerId) {
        this.playerId = playerId;
        this.number = number;
    }

    public Dice() {}
}
