package com.example.demo.heartStone.illustration.service.request;

import com.example.demo.heartStone.illustration.entity.Illustration;
import com.example.demo.heartStone.illustration.entity.IllustrationFrame;
import com.example.demo.heartStone.illustration.entity.IllustrationImage;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class IllustrationCreateRequest {
    final private IllustrationFrame illustrationFrame;
    final private IllustrationImage illustrationImage;

    public Illustration toIllustration() {
        return new Illustration(
                illustrationFrame, illustrationImage
        );
    }
}
