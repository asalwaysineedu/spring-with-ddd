package com.example.demo.player.controller.requestForm;

import com.example.demo.player.service.request.PlayerRegistRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PlayerRegistRequestForm {
    final private String nickname;

    public PlayerRegistRequest toRegistPlayerRequest() {
        return new PlayerRegistRequest(nickname);
    }
}
