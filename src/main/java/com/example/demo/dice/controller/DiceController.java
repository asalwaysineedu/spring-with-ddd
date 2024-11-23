package com.example.demo.dice.controller;

import com.example.demo.dice.service.DiceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j // log 작성 시 활용
@RestController // 기본적으로 다루는 데이터를 JSON으로 처리한다.
@RequiredArgsConstructor // 생성자 주입
@RequestMapping("/dice") // api 요청 시 필요한 주소
public class DiceController {
    final private DiceService diceService;

    @GetMapping("/test")
    public String diceTest() {
        log.info("diceTest() called");
        return "diceTest()";
    }

    @GetMapping("/roll-dice")
    public Integer rollDice() {
        log.info("rollDice() called");
        Integer acquiredDiceNumber = diceService.rollDice();
        return acquiredDiceNumber;
    }
}
