package com.example.melona.domain.dto.response;

import lombok.*;

@Getter @Setter @Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignInResponseData {
    private Long userId;
    private String nickname;
}
