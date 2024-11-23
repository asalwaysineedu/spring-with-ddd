package com.example.demo.player.repository;

import com.example.demo.player.entity.Player;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PlayerRepositoryImpl implements PlayerRepository{
    static List<Player> playerList = new ArrayList<>();

    final String playerNickname = "타짜_";
    int playerCount = 0;

    @Override
    public Player create() {
        // nickname을 타짜_0, 타짜_1, 타짜_2, .. 이런식으로 만든다고
        String nickname = playerNickname + ++playerCount;
        Player player = new Player(nickname);

        playerList.add(player);

        return player;
    }
}
