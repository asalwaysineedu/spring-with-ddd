package com.example.demo.heartStone.graphicTexture.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class GraphicTexture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int positionX;
    private int positionY;

    public GraphicTexture() {}

    public GraphicTexture(String name, int positionX, int positionY) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
    }
}
