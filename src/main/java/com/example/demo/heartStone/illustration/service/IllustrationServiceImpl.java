package com.example.demo.heartStone.illustration.service;

import com.example.demo.heartStone.illustration.entity.Illustration;
import com.example.demo.heartStone.illustration.repository.IllustrationRepository;
import com.example.demo.heartStone.illustration.service.request.IllustrationCreateRequest;
import com.example.demo.heartStone.illustration.service.response.IllustrationCreateResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class IllustrationServiceImpl implements IllustrationService {
    final private IllustrationRepository illustrationRepository;

    @Override
    public Illustration findById(Long illustrationId) {
        return illustrationRepository.findById(illustrationId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 일러스트입니다."));
    }

    @Override
    public IllustrationCreateResponse create(IllustrationCreateRequest illustrationCreateRequest) {
        final Illustration savedIllustration = illustrationRepository.save(illustrationCreateRequest.toIllustration());
        return IllustrationCreateResponse.from(savedIllustration);
    }
}
