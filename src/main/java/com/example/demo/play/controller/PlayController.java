package com.example.demo.play.controller;

import com.example.demo.play.controller.requestForm.PlayDiceGameRequestForm;
import com.example.demo.play.entity.Play;
import com.example.demo.play.service.PlayService;
import com.example.demo.play.service.response.PlayDiceGameResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/play")
public class PlayController {
    final private PlayService playService;

    @GetMapping("/dice")
    public Play playDiceGame(@RequestBody PlayDiceGameRequestForm requestForm) {
        return playService.diceGame(requestForm.toPlayDiceGame());
    }

    @GetMapping("/dice/winner/{playId}")
    public String getDiceGameWinner(@PathVariable("playId") Long playId) {
        return playService.getDiceGameWinner(playId);
    }
}
