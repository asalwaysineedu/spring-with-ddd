package com.example.demo.player.service;

import com.example.demo.player.entity.Player;

import java.util.List;

public interface PlayerService {
    Player createPlayer();
    List<Player> createRandomPlayerWithMaximumNumber(int maximumNumber);

    List<Player> getPlayerList();
}
