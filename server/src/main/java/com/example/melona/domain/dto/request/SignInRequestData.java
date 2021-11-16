package com.example.melona.domain.dto.request;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class SignInRequestData {
    private String username;
    private String password;
}
