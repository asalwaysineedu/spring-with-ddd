package com.example.demo.player.controller;

import com.example.demo.player.entity.Player;
import com.example.demo.player.service.PlayerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/player")
public class PlayerController {
    final private PlayerService playerService;

    @GetMapping("/create-player")
    public Player createPlayer() {
        log.info("createPlayer() called");

        Player player = playerService.createPlayer();

        return player;
    }

    @PostMapping("/create/tazza")
    public List<Player> createPlayerWithMaximum(@RequestParam("maximum") int maximum) {
        return playerService.createRandomPlayerWithMaximumNumber(maximum);
    }
}
