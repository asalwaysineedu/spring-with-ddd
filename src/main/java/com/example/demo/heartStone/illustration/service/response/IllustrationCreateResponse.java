package com.example.demo.heartStone.illustration.service.response;

import com.example.demo.heartStone.illustration.entity.Illustration;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class IllustrationCreateResponse {
    final private Long illustrationId;
    final private String illustrationFrame;
    final private String illustrationImage;

    public static IllustrationCreateResponse from(Illustration illustration) {
        return new IllustrationCreateResponse(
                illustration.getId(),
                illustration.getFrame().name(),
                illustration.getImage().name()
        );
    }
}
