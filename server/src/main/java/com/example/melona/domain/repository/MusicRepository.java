package com.example.melona.domain.repository;

import com.example.melona.domain.entity.Music;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicRepository extends JpaRepository<Music, Long> {
}
