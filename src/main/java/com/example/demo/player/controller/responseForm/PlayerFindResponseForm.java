package com.example.demo.player.controller.responseForm;

import com.example.demo.dice.entity.Dice;
import com.example.demo.player.service.response.PlayerListResponse;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@RequiredArgsConstructor
public class PlayerFindResponseForm {
    final private Long id;
    final private String nickname;
    final private LocalDateTime createDateTime;
    final private LocalDateTime modifyDatetime;
    final private List<Dice> diceList;

    public static PlayerFindResponseForm from(PlayerListResponse list) {
        return new PlayerFindResponseForm(
                list.getId(),
                list.getNickname(),
                list.getCreateDateTime(),
                list.getModifyDatetime(),
                list.getDiceList()
        );
    }
}
