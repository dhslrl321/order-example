package com.example.melona.controller;

import com.example.melona.domain.dto.response.MusicResponseData;
import com.example.melona.service.MusicService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MusicController {

    private final MusicService musicService;

    @GetMapping("/api/musics/{musicId}")
    public ResponseEntity<Resource> getMusic(@PathVariable Long musicId) {
        return ResponseEntity
                .ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\\")
                .body(musicService.getMusicStream(musicId));
    }
}
