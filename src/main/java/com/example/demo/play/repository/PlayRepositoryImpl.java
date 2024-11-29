package com.example.demo.play.repository;

import com.example.demo.play.entity.Play;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PlayRepositoryImpl implements PlayRepository{
    static List<Play> diceGameResults = new ArrayList<>();

    @Override
    public void savePlayHistory(Play playHistory) {
        diceGameResults.add(playHistory);
    }

    @Override
    public Play findByPlayId(Long playId) {
        return diceGameResults.stream()
                .filter(play -> play.getId().equals(playId))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("해당하는 게임 결과가 없습니다."));
    }
}
