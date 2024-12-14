package com.example.demo.play.repository;

import com.example.demo.play.entity.Play;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayRepository extends JpaRepository<Play, Long> {
}
