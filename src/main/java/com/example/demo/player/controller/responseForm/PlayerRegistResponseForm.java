package com.example.demo.player.controller.responseForm;

import com.example.demo.player.service.response.PlayerRegistResponse;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PlayerRegistResponseForm {
    final private String nickname;

    public static PlayerRegistResponseForm from(PlayerRegistResponse playerCreateResponse) {
        return new PlayerRegistResponseForm(playerCreateResponse.getNickname());
    }
}
