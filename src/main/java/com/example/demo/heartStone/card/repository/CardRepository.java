package com.example.demo.heartStone.card.repository;

import com.example.demo.heartStone.card.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}
