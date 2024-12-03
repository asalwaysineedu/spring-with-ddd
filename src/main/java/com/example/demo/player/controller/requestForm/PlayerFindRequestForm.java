package com.example.demo.player.controller.requestForm;

import com.example.demo.player.service.request.PlayerFindRequest;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PlayerFindRequestForm {
    final private String nickname;

    public PlayerFindRequest toFindPlayerRequest() {
        return new PlayerFindRequest(nickname);
    }
}
