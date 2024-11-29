package com.example.demo.play.service;

import com.example.demo.dice.entity.Dice;
import com.example.demo.dice.service.DiceService;
import com.example.demo.game.entity.Game;
import com.example.demo.game.repository.GameRepository;
import com.example.demo.play.entity.Play;
import com.example.demo.play.repository.PlayRepository;
import com.example.demo.play.service.request.PlayDiceGameRequest;
import com.example.demo.play.service.response.PlayDiceGameResponse;
import com.example.demo.player.entity.Player;
import com.example.demo.player.service.PlayerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;

@Slf4j
@Service
@RequiredArgsConstructor
public class PlayServiceImpl implements PlayService{
    final private GameRepository gameRepository;
    final private PlayRepository playRepository;
    final private PlayerService playerService;
    final private DiceService diceService;

    int id = 0;

    @Override
    public Play diceGame(PlayDiceGameRequest request) {
        final Game game = gameRepository.getGame(request.getGameType());

        List<PlayDiceGameResponse> result = new ArrayList<>();
        List<Player> players = playerService.getPlayerList();

        for (Player player : players) {
            List<Dice> diceResults = diceService.rollDiceWithMaximumChance(request.getMaximumChance());
            PlayDiceGameResponse _result = new PlayDiceGameResponse(player.getNickname(), diceResults);
            result.add(_result);
        }

        Play playHistory = new Play((long) ++id, game, result);
        playRepository.savePlayHistory(playHistory);
        return playHistory;
    }
}
