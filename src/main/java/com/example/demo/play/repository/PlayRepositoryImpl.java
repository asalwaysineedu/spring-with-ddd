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
}
