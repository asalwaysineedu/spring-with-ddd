package com.example.demo.player.service.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PlayerFindRequest {
    final private String nickname;
}
