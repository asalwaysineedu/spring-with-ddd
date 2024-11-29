package com.example.demo.player.repository;

import com.example.demo.player.entity.Player;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.example.demo.utility.nickName.NicknameUtils.getRandomNickNameList;

@Repository
public class PlayerRepositoryImpl implements PlayerRepository{
    static List<Player> playerList = new ArrayList<>();
    final String[] tazza = {"고니", "아귀", "짝귀", "정마담", "평경장", "고광렬", "곽철용", "춘재", "화란", "세란", "너구리"};
    final String playerNickname = "타짜_";
    int playerCount = 0;

    @Override
    public Player create() {
        // nickname을 타짜_0, 타짜_1, 타짜_2, .. 이런식으로 만든다고
        String nickname = playerNickname + ++playerCount;
        Player player = new Player((long) playerCount, nickname);

        playerList.add(player);

        return player;
    }

    @Override
    public List<Player> createRandomPlayerWithMaximumNumber(int maximumNumber) {
        List<String> _tazza = new ArrayList<>(Arrays.asList(tazza));
        List<String> randomPlayerList = getRandomNickNameList(_tazza, maximumNumber);

        // 초기화 해주지 않으면 기존에 생성된 플레이어에 누적됨.
        playerList = new ArrayList<>();

        for (String nickname : randomPlayerList) {
            playerList.add(
                    new Player((long) ++playerCount, nickname)
            );
        }
        return playerList;
    }

    @Override
    public List<Player> getPlayerList() {
        if (playerList.isEmpty()) throw new IllegalArgumentException("생성된 플레이어가 없습니다. 생성해 주세요.");
        return playerList;
    }
}
