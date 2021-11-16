package com.example.melona.domain.exception;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super("[ " + message + " ] 이 존재하지 않습니다.");
    }
}
