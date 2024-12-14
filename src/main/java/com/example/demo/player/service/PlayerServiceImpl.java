package com.example.demo.player.service;

import com.example.demo.dice.entity.Dice;
import com.example.demo.dice.repository.DiceRepository;
import com.example.demo.player.entity.Player;
import com.example.demo.player.repository.PlayerRepository;
import com.example.demo.player.service.request.PlayerFindRequest;
import com.example.demo.player.service.request.PlayerRegistRequest;
import com.example.demo.player.service.response.PlayerListResponse;
import com.example.demo.player.service.response.PlayerRegistResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<Player> findAllByPlayerIdList(List<Long> playerIdList) {
        return playerRepository.findAllById(playerIdList);
    }

    @Override
    public PlayerListResponse list(PlayerFindRequest request) {
        Player maybePlayer = playerRepository.findByNickname(request.getNickname())
                .orElseThrow(() -> new IllegalArgumentException("해당 플레이어는 없습니다."));

        return PlayerListResponse.from(maybePlayer, null);
    }
}
