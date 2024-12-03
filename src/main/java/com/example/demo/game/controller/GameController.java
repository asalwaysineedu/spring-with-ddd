package com.example.demo.game.controller;

import com.example.demo.game.controller.requestForm.GameRegistRequestForm;
import com.example.demo.game.controller.responseForm.GameCreateResponseForm;
import com.example.demo.game.service.GameService;
import com.example.demo.game.service.response.GameListResponse;
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
    public GameCreateResponseForm create(@RequestBody GameRegistRequestForm requestForm) {
        log.info("Game Create(): called!");
        return GameCreateResponseForm.from(
                gameService.create(requestForm.toGameCreateRequest()));
    }

    @GetMapping("/list")
    public List<GameListResponse> list() {
        log.info("Game List(): called!");
        return gameService.list();
    }
}
