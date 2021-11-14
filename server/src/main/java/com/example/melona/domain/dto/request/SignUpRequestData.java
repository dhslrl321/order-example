package com.example.melona.domain.dto.request;

import lombok.*;

@Getter @Setter @Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignUpRequestData {
    private String username;
    private String password;
    private String nickname;
}
