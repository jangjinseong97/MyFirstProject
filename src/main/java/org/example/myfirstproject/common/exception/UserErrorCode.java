package org.example.myfirstproject.common.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum UserErrorCode implements ErrorCode {
    NO_TYPE_IN_USER(HttpStatus.BAD_REQUEST, "올바르지 않는 타입입니다.");

    private final HttpStatus httpStatus;
    private final String message;
}
