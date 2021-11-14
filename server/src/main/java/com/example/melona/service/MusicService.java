package com.example.melona.service;

import com.example.melona.domain.dto.response.MusicResponseData;
import com.example.melona.domain.entity.Music;
import com.example.melona.domain.exception.NotFoundException;
import com.example.melona.domain.repository.MusicRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RequiredArgsConstructor
@Service
@Transactional
public class MusicService {

    private static final String MUSIC_DIR = System.getProperty("user.dir") + "/music/";

    private final MusicRepository musicRepository;

    public Resource getMusicStream(Long musicId) {
        Music music = musicRepository.findById(musicId)
                .orElseThrow(() -> new NotFoundException("음악 번호 " + musicId));

        Path filePath = Paths.get(MUSIC_DIR + music.getFilename());
        try {
            Resource resource = new UrlResource(filePath.toUri());
            if(!resource.exists()) {
                throw new NotFoundException("음악 파일이 존재하지 않습니다");
            }
            return resource;
        } catch (MalformedURLException e) {
            throw new NotFoundException("음악 파일이 존재하지 않습니다");
        }
    }
}
