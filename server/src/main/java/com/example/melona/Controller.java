package com.example.melona;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class Controller {

    @GetMapping("/test")
    public ResponseEntity test() {

        String musicDir = System.getProperty("user.dir") + "/music/";
        String filename = "music1.mp3";

        // Load File as Resource
        Resource resource = loadFileAsResource(musicDir + filename);

        return ResponseEntity.ok().contentType(MediaType.parseMediaType("application/octet-stream")).body(resource);
    }

    private static Resource loadFileAsResource(String path) {
        try {
            Path filename = Path.of(path);
            Resource resource = new UrlResource(filename.toUri());

            if(resource.exists()) {
                return resource;
            }
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
