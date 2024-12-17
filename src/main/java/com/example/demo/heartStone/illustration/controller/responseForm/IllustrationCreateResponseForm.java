package com.example.demo.heartStone.illustration.controller.responseForm;

import com.example.demo.heartStone.illustration.service.response.IllustrationCreateResponse;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class IllustrationCreateResponseForm {
    final private Long illustrationId;
    final private String illustrationFrame;
    final private String illustrationImage;

    public static IllustrationCreateResponseForm from(IllustrationCreateResponse illustrationCreateResponse) {
        return new IllustrationCreateResponseForm(
                illustrationCreateResponse.getIllustrationId(),
                illustrationCreateResponse.getIllustrationFrame(),
                illustrationCreateResponse.getIllustrationImage()
        );
    }
}
