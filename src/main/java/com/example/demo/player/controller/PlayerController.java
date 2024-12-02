package com.example.demo.player.controller;

import com.example.demo.player.controller.requestForm.PlayerRegistRequestForm;
import com.example.demo.player.controller.responseForm.PlayerRegistResponseForm;
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

    @GetMapping("/create")
    public PlayerRegistResponseForm create(@RequestBody PlayerRegistRequestForm form) {
        log.info("Player Create(): called");
        return PlayerRegistResponseForm.from(
                playerService.createPlayer(form.toRegistPlayer()));
    }
}
