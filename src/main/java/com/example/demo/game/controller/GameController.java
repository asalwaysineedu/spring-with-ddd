package com.example.demo.game.controller;

import com.example.demo.game.controller.requestForm.GameCreateRequestForm;
import com.example.demo.game.entity.Game;
import com.example.demo.game.service.GameService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/game")
public class GameController {
    final private GameService gameService;

    @PostMapping("/create")
    public Game create(@RequestBody GameCreateRequestForm requestForm) {
        return gameService.create(requestForm.toGameCreateRequest());
    }

    @GetMapping("/list")
    public List<Game> getGameList() {
        return gameService.getGameList();
    }
}
