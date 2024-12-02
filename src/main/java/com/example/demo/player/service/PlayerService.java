package com.example.demo.player.service;

import com.example.demo.player.entity.Player;
import com.example.demo.player.service.request.PlayerRegistRequest;
import com.example.demo.player.service.response.PlayerRegistResponse;

import java.util.List;

public interface PlayerService {
    PlayerRegistResponse createPlayer(PlayerRegistRequest request);
}
