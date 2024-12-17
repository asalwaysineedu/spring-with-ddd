package com.example.demo.heartStone.illustration.controller.requestForm;

import com.example.demo.heartStone.illustration.entity.IllustrationFrame;
import com.example.demo.heartStone.illustration.entity.IllustrationImage;
import com.example.demo.heartStone.illustration.service.request.IllustrationCreateRequest;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class IllustrationCreateRequestForm {
    final private IllustrationFrame illustrationFrame;
    final private IllustrationImage illustrationImage;

    public IllustrationCreateRequest toIllustrationCreateRequest() {
        return new IllustrationCreateRequest(illustrationFrame, illustrationImage);
    }
}
