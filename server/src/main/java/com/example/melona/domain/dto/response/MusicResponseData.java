package com.example.melona.domain.dto.response;

import lombok.*;

import java.io.File;
import java.io.InputStream;

@Getter @Setter @Builder
@NoArgsConstructor
@AllArgsConstructor
public class MusicResponseData {
    private Long musicId;
    private String title;
    private String singer;
    private File stream;
}
