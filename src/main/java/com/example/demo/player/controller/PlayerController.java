package com.example.demo.player.controller;

import com.example.demo.player.controller.requestForm.PlayerFindRequestForm;
import com.example.demo.player.controller.requestForm.PlayerRegistRequestForm;
import com.example.demo.player.controller.responseForm.PlayerFindResponseForm;
import com.example.demo.player.controller.responseForm.PlayerRegistResponseForm;
import com.example.demo.player.service.PlayerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/player")
public class PlayerController {
    final private PlayerService playerService;

    @PostMapping("/create")
    public PlayerRegistResponseForm create(@RequestBody PlayerRegistRequestForm form) {
        log.info("Player Create(): called");
        return PlayerRegistResponseForm.from(
                playerService.createPlayer(form.toRegistPlayerRequest()));
    }

    @GetMapping("/list")
    public PlayerFindResponseForm list(@RequestBody PlayerFindRequestForm form) {
        log.info("Player List(): called");
        return PlayerFindResponseForm.from(
                playerService.list(form.toFindPlayerRequest()));
    }
}
