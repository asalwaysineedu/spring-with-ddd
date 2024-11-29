package com.example.demo.player.repository;

import com.example.demo.player.entity.Player;

import java.util.List;

public interface PlayerRepository {
    Player create();
    List<Player> createRandomPlayerWithMaximumNumber(int maximumNumber);
    List<Player> getPlayerList();
}
