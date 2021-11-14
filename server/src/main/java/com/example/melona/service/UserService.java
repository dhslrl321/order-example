package com.example.melona.service;

import com.example.melona.domain.dto.response.SignInResponseData;
import com.example.melona.domain.entity.User;
import com.example.melona.domain.exception.NotFoundException;
import com.example.melona.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
public class UserService {
    private final UserRepository userRepository;

    public SignInResponseData login(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new NotFoundException("사용자 번호" + userId));

        return SignInResponseData.builder()
                .userId(user.getId())
                .nickname(user.getNickname())
                .build();
    }
}
