package com.example.melona;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {

    @GetMapping("/music")
    public ResponseEntity downloadImg(HttpServletResponse response) throws Exception {
        String musicDir = System.getProperty("user.dir") + "/music/";
        String filename = "music3.wav";

        Path filePath = Paths.get(musicDir + filename);
        Resource resource = new InputStreamResource(Files.newInputStream(filePath)); // 파일 resource 얻기

        File file = new File(musicDir + filename);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentDisposition(ContentDisposition.builder("attachment").filename(file.getName()).build());  // 다운로드 되거나 로컬에 저장되는 용도로 쓰이는지를 알려주는 헤더

        return new ResponseEntity(resource, headers, HttpStatus.OK);
    }

    @GetMapping("/message")
    public ResponseEntity<Dto> simple() {
        return ResponseEntity.ok(new Dto("jang", 12));
    }
}
