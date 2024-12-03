package com.example.demo.dice.controller;

import com.example.demo.dice.controller.requestForm.DiceRegistRequestForm;
import com.example.demo.dice.controller.responseForm.DiceRegistResponseForm;
import com.example.demo.dice.service.DiceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j // log 작성 시 활용
@RestController // 기본적으로 다루는 데이터를 JSON으로 처리한다.
@RequiredArgsConstructor // 생성자 주입
@RequestMapping("/dice") // api 요청 시 필요한 주소
public class DiceController {
    final private DiceService diceService;

    @GetMapping("/roll-dice")
    public DiceRegistResponseForm rollDice(@RequestBody DiceRegistRequestForm form) {
        log.info("rollDice() called");
        return DiceRegistResponseForm.from(
                diceService.rollDice(form.toDiceRegistRequest()));
    }
}
