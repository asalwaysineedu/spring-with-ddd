package com.example.demo.play.service;

import com.example.demo.dice.entity.Dice;
import com.example.demo.dice.service.DiceService;
import com.example.demo.dice.service.response.DiceRegistResponse;
import com.example.demo.play.controller.request.PlayDiceGameWinnerRequestForm;
import com.example.demo.play.entity.Play;
import com.example.demo.play.repository.PlayRepository;
import com.example.demo.play.service.request.PlayDiceGameRequest;
import com.example.demo.play.service.request.PlayDiceGameWinnerRequest;
import com.example.demo.play.service.response.PlayDiceGameResponse;
import com.example.demo.player.entity.Player;
import com.example.demo.player.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
@Service
@RequiredArgsConstructor
public class PlayServiceImpl implements PlayService{
    final private PlayRepository playRepository;
    final private PlayerRepository playerRepository;
    final private DiceService diceService;

    @Override
    public PlayDiceGameResponse playDiceGame(PlayDiceGameRequest request) {
        final Player savedPlayer = playerRepository.findById(request.getPlayerId()).orElseThrow(() -> new IllegalArgumentException("해당 플레이어는 없습니다."));
        final List<DiceRegistResponse> diceList = diceService.rollDiceWithMaximumChance(request.getMaximumChance(), request.getPlayerId());
        final List<Long> diceIdList = diceList.stream().map(DiceRegistResponse::getId).toList();
        final Play savedPlay = playRepository.save(request.toPlay(savedPlayer, diceIdList));

        return PlayDiceGameResponse.from(savedPlay, savedPlayer, diceList);
    }

    @Override
    public List<Play> list() {
        return playRepository.findAll();
    }

    @Override
    public String getDiceGameWinner(PlayDiceGameWinnerRequest request) {
        final List<Play> playList = playRepository.findAllById(request.getPlayIdList());

//        playList.stream().map(Dice::getNumber).;
        return "";
    }
}
