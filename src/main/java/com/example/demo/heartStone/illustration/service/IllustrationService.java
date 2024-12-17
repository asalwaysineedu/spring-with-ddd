package com.example.demo.heartStone.illustration.service;

import com.example.demo.heartStone.illustration.entity.Illustration;
import com.example.demo.heartStone.illustration.service.request.IllustrationCreateRequest;
import com.example.demo.heartStone.illustration.service.response.IllustrationCreateResponse;

public interface IllustrationService {
    IllustrationCreateResponse create(IllustrationCreateRequest illustrationCreateRequest);
}
