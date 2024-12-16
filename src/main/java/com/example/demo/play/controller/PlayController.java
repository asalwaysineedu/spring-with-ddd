package com.example.demo.play.controller;

import com.example.demo.play.controller.request.PlayDiceGameRequestForm;
import com.example.demo.play.controller.request.PlayDiceGameWinnerRequestForm;
import com.example.demo.play.controller.response.PlayDiceGameResponseForm;
import com.example.demo.play.entity.Play;
import com.example.demo.play.service.PlayService;
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

    @PostMapping("/dice")
    public PlayDiceGameResponseForm playDiceGame(@RequestBody PlayDiceGameRequestForm form) {
        return PlayDiceGameResponseForm.from(playService.playDiceGame(form.toPlayDiceGame()));
    }

    @GetMapping("/list")
    public List<Play> list() {
        return playService.list();
    }

    @GetMapping("/dice/winner")
    public String diceGameWinner(@RequestBody PlayDiceGameWinnerRequestForm form) {
        return playService.getDiceGameWinner(form.toGetDiceGameWinner());
    }
}
