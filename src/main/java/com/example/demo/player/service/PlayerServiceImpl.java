package com.example.demo.player.service;

import com.example.demo.player.entity.Player;
import com.example.demo.player.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService{
    final private PlayerRepository playerRepository;

    @Override
    public Player createPlayer() {
        return playerRepository.create();
    }
}
