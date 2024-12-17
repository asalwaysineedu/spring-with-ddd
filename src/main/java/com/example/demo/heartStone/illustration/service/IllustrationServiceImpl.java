    @Override
    public Illustration findById(Long illustrationId) {
        return illustrationRepository.findById(illustrationId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 일러스트입니다."));
    }

