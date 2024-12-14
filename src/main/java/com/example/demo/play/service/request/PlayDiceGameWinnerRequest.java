package com.example.demo.play.service.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class PlayDiceGameWinnerRequest {
    final private List<Long> playIdList;
}
