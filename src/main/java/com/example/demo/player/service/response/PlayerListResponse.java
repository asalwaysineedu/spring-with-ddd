package com.example.demo.player.service.response;

import com.example.demo.dice.entity.Dice;
import com.example.demo.player.entity.Player;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@RequiredArgsConstructor
public class PlayerListResponse {
    final private Long id;
    final private String nickname;
    final private LocalDateTime createDateTime;
    final private LocalDateTime modifyDatetime;
    final private List<Dice> diceList;

    public static PlayerListResponse from(Player player, List<Dice> diceList) {
        return new PlayerListResponse(
                player.getId(),
                player.getNickname(),
                player.getCreateDateTime(),
                player.getModifyDateTime(),
                diceList);
    }
}
