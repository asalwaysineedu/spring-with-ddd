package com.example.demo.heartStone.illustration.repository;

import com.example.demo.heartStone.illustration.entity.Illustration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IllustrationRepository extends JpaRepository<Illustration, Long> {
}
