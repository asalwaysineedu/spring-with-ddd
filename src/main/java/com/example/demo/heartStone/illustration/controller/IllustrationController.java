package com.example.demo.heartStone.illustration.controller;

import com.example.demo.heartStone.illustration.controller.requestForm.IllustrationCreateRequestForm;
import com.example.demo.heartStone.illustration.controller.responseForm.IllustrationCreateResponseForm;
import com.example.demo.heartStone.illustration.service.IllustrationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/illustration")
public class IllustrationController {
    final private IllustrationService illustrationService;

    @PostMapping("/create")
    public IllustrationCreateResponseForm create(@RequestBody IllustrationCreateRequestForm requestForm) {
        return IllustrationCreateResponseForm.from(
                illustrationService.create(requestForm.toIllustrationCreateRequest()));
    }
}
