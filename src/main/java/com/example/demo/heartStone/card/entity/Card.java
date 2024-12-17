package com.example.demo.heartStone.card.entity;

import com.example.demo.heartStone.illustration.entity.Illustration;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int hp;
    private int attackPower;

    private String name;
    private String skillSummery;

    @Enumerated(EnumType.STRING)
    private Placement placement;

    public Card() {}

    public Card(int hp, int attackPower, String name, String skillSummery, Placement placement) {
        this.hp = hp;
        this.name = name;
        this.placement = placement;
        this.attackPower = attackPower;
        this.skillSummery = skillSummery;
    }
}
