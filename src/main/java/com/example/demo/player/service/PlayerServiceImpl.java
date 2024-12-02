package com.example.demo.player.service;

import com.example.demo.player.controller.responseForm.PlayerRegistResponseForm;
import com.example.demo.player.entity.Player;
import com.example.demo.player.repository.PlayerRepository;
import com.example.demo.player.service.request.PlayerRegistRequest;
import com.example.demo.player.service.response.PlayerRegistResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;

@Slf4j
@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService{
    final private PlayerRepository playerRepository;

    @Override
    public PlayerRegistResponse createPlayer(PlayerRegistRequest request) {
        final Player savedPlayer = playerRepository.save(request.toPlayer());
        return new PlayerRegistResponse(savedPlayer.getNickname());
    }
}
